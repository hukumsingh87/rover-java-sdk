package org.rover.sdk.federation;

import junit.framework.TestCase;

import okhttp3.HttpUrl;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class FederationServerTest extends TestCase {
  private final String successResponse =
          "{\"rover_address\":\"bob*rover.network\",\"account_id\":\"GCW667JUHCOP5Y7KY6KGDHNPHFM4CS3FCBQ7QWDUALXTX3PGXLSOEALY\"}";
  private final String successResponseWithMemo =
          "{\"rover_address\":\"bob*rover.network\",\"account_id\":\"GCW667JUHCOP5Y7KY6KGDHNPHFM4CS3FCBQ7QWDUALXTX3PGXLSOEALY\", \"memo_type\": \"text\", \"memo\": \"test\"}";

  private final String notFoundResponse =
          "{\"code\":\"not_found\",\"message\":\"Account not found\"}";

  private final String roverToml =
          "FEDERATION_SERVER = \"https://api.rover.network/federation\"";

  @Before
  public void setUp() throws IOException {
    FederationServer.httpsConnection = false;
  }

  @After
  public void tearDown() throws IOException {
    FederationServer.httpsConnection = true;
  }

  @Test
  public void testCreateForDomain() throws IOException, InterruptedException {
    MockWebServer mockWebServer = new MockWebServer();
    mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(roverToml));
    mockWebServer.start();

    HttpUrl baseUrl = mockWebServer.url("");
    String domain = String.format("%s:%d", baseUrl.host(), baseUrl.port());
    FederationServer server = FederationServer.createForDomain(domain);
    assertEquals(server.getServerUri().toString(), "https://api.rover.network/federation");
    assertEquals(server.getDomain(), domain);

    RecordedRequest roverTomlRequest = mockWebServer.takeRequest();
    assertEquals("http://"+domain+"/.well-known/rover.toml", roverTomlRequest.getRequestUrl().toString());
  }

  @Test
  public void testNameFederationSuccess() throws IOException {
    MockWebServer mockWebServer = new MockWebServer();
    mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(successResponse));
    mockWebServer.start();
    HttpUrl baseUrl = mockWebServer.url("");

    FederationServer server = new FederationServer(
            baseUrl.toString(),
            "rover.network"
    );

    FederationResponse response = server.resolveAddress("bob*rover.network");
    assertEquals(response.getRoverAddress(), "bob*rover.network");
    assertEquals(response.getAccountId(), "GCW667JUHCOP5Y7KY6KGDHNPHFM4CS3FCBQ7QWDUALXTX3PGXLSOEALY");
    assertNull(response.getMemoType());
    assertNull(response.getMemo());
  }

  @Test
  public void testNameFederationSuccessWithMemo() throws IOException {
    MockWebServer mockWebServer = new MockWebServer();
    mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(successResponseWithMemo));
    mockWebServer.start();
    HttpUrl baseUrl = mockWebServer.url("");

    FederationServer server = new FederationServer(
            baseUrl.toString(),
            "rover.network"
    );

    FederationResponse response = server.resolveAddress("bob*rover.network");
    assertEquals(response.getRoverAddress(), "bob*rover.network");
    assertEquals(response.getAccountId(), "GCW667JUHCOP5Y7KY6KGDHNPHFM4CS3FCBQ7QWDUALXTX3PGXLSOEALY");
    assertEquals(response.getMemoType(), "text");
    assertEquals(response.getMemo(), "test");
  }

  @Test
  public void testNameFederationNotFound() throws IOException {
    MockWebServer mockWebServer = new MockWebServer();
    mockWebServer.enqueue(new MockResponse().setResponseCode(404).setBody(notFoundResponse));
    mockWebServer.start();
    HttpUrl baseUrl = mockWebServer.url("");

    FederationServer server = new FederationServer(
            baseUrl.toString(),
            "rover.network"
    );

    try {
      FederationResponse response = server.resolveAddress("bob*rover.network");
      fail("Expected exception");
    } catch (NotFoundException e) {}
  }
}
