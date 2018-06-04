package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.KeyPair;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class OffersRequestBuilderTest {
  @Test
  public void testForAccount() {
    Server server = new Server("https://orbit-testnet.rover.network");
    HttpUrl uri = server.offers()
            .forAccount(KeyPair.fromAccountId("GBRPYHIL2CI3FNQ4BXLFMNDLFJUNPU2HY3ZMFSHONUCEOASW7QC7OX2H"))
            .limit(200)
            .order(RequestBuilder.Order.DESC)
            .buildUri();
    assertEquals("https://orbit-testnet.rover.network/accounts/GBRPYHIL2CI3FNQ4BXLFMNDLFJUNPU2HY3ZMFSHONUCEOASW7QC7OX2H/offers?limit=200&order=desc", uri.toString());
  }
}
