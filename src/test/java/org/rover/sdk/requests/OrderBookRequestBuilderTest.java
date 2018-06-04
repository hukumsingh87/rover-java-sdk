package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.Asset;
import org.rover.sdk.KeyPair;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class OrderBookRequestBuilderTest {
  @Test
  public void testOrderBook() {
    Server server = new Server("https://orbit-testnet.rover.network");
    HttpUrl uri = server.orderBook()
            .buyingAsset(Asset.createNonNativeAsset("EUR", KeyPair.fromAccountId("GAUPA4HERNBDPVO4IUA3MJXBCRRK5W54EVXTDK6IIUTGDQRB6D5W242W")))
            .sellingAsset(Asset.createNonNativeAsset("USD", KeyPair.fromAccountId("GDRRHSJMHXDTQBT4JTCILNGF5AS54FEMTXL7KOLMF6TFTHRK6SSUSUZZ")))
            .buildUri();

    assertEquals(
      "https://orbit-testnet.rover.network/order_book?" +
      "buying_asset_type=credit_alphanum4&" +
      "buying_asset_code=EUR&" +
      "buying_asset_issuer=GAUPA4HERNBDPVO4IUA3MJXBCRRK5W54EVXTDK6IIUTGDQRB6D5W242W&" +
      "selling_asset_type=credit_alphanum4&" +
      "selling_asset_code=USD&" +
      "selling_asset_issuer=GDRRHSJMHXDTQBT4JTCILNGF5AS54FEMTXL7KOLMF6TFTHRK6SSUSUZZ",
      uri.toString());
  }
}
