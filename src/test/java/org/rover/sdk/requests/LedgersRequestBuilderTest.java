package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class LedgersRequestBuilderTest {
  @Test
  public void testAccounts() {
    Server server = new Server("https://orbit-testnet.rover.network");
    HttpUrl uri = server.ledgers()
            .limit(200)
            .order(RequestBuilder.Order.ASC)
            .buildUri();
    assertEquals("https://orbit-testnet.rover.network/ledgers?limit=200&order=asc", uri.toString());
  }
}
