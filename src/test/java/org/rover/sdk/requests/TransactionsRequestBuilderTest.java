package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.KeyPair;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class TransactionsRequestBuilderTest {
  @Test
  public void testTransactions() {
    Server server = new Server("https://orbit-testnet.rover.network");
    HttpUrl uri = server.transactions()
            .limit(200)
            .order(RequestBuilder.Order.DESC)
            .buildUri();
    assertEquals("https://orbit-testnet.rover.network/transactions?limit=200&order=desc", uri.toString());
  }

  @Test
  public void testForAccount() {
    Server server = new Server("https://orbit-testnet.rover.network");
    HttpUrl uri = server.transactions()
            .forAccount(KeyPair.fromAccountId("GBRPYHIL2CI3FNQ4BXLFMNDLFJUNPU2HY3ZMFSHONUCEOASW7QC7OX2H"))
            .limit(200)
            .order(RequestBuilder.Order.DESC)
            .buildUri();
    assertEquals("https://orbit-testnet.rover.network/accounts/GBRPYHIL2CI3FNQ4BXLFMNDLFJUNPU2HY3ZMFSHONUCEOASW7QC7OX2H/transactions?limit=200&order=desc", uri.toString());
  }

  @Test
  public void testForLedger() {
    Server server = new Server("https://orbit-testnet.rover.network");
    HttpUrl uri = server.transactions()
            .forLedger(200000000000L)
            .limit(50)
            .order(RequestBuilder.Order.ASC)
            .buildUri();
    assertEquals("https://orbit-testnet.rover.network/ledgers/200000000000/transactions?limit=50&order=asc", uri.toString());
  }
}
