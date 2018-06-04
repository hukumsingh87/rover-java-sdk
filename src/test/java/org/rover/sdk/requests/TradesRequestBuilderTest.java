package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.Asset;
import org.rover.sdk.KeyPair;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class TradesRequestBuilderTest {
    @Test
    public void testOrderBook() {
        Server server = new Server("https://orbit-testnet.rover.network");
        HttpUrl uri = server.trades()
                .baseAsset(Asset.createNonNativeAsset("EUR", KeyPair.fromAccountId("GAUPA4HERNBDPVO4IUA3MJXBCRRK5W54EVXTDK6IIUTGDQRB6D5W242W")))
                .counterAsset(Asset.createNonNativeAsset("USD", KeyPair.fromAccountId("GDRRHSJMHXDTQBT4JTCILNGF5AS54FEMTXL7KOLMF6TFTHRK6SSUSUZZ")))
                .cursor("13537736921089")
                .limit(200)
                .order(RequestBuilder.Order.ASC)
                .buildUri();

        assertEquals("https://orbit-testnet.rover.network/trades?" +
                "base_asset_type=credit_alphanum4&" +
                "base_asset_code=EUR&" +
                "base_asset_issuer=GAUPA4HERNBDPVO4IUA3MJXBCRRK5W54EVXTDK6IIUTGDQRB6D5W242W&" +
                "counter_asset_type=credit_alphanum4&" +
                "counter_asset_code=USD&" +
                "counter_asset_issuer=GDRRHSJMHXDTQBT4JTCILNGF5AS54FEMTXL7KOLMF6TFTHRK6SSUSUZZ&" +
                "cursor=13537736921089&" +
                "limit=200&" +
                "order=asc", uri.toString());

    }
}
