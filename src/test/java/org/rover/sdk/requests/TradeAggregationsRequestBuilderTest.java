package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.Asset;
import org.rover.sdk.AssetTypeNative;
import org.rover.sdk.KeyPair;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class TradeAggregationsRequestBuilderTest {
    @Test
    public void testTradeAggregations() {
        Server server = new Server("https://orbit-testnet.rover.network");
        HttpUrl uri = server.tradeAggregations(
                new AssetTypeNative(),
                Asset.createNonNativeAsset("BTC", KeyPair.fromAccountId("GATEMHCCKCY67ZUCKTROYN24ZYT5GK4EQZ65JJLDHKHRUZI3EUEKMTCH")),
                1512689100000L,
                1512775500000L,
                300000L
        ).limit(200).order(RequestBuilder.Order.ASC).buildUri();

        assertEquals("https://orbit-testnet.rover.network/trade_aggregations?" +
                "base_asset_type=native&" +
                "counter_asset_type=credit_alphanum4&" +
                "counter_asset_code=BTC&" +
                "counter_asset_issuer=GATEMHCCKCY67ZUCKTROYN24ZYT5GK4EQZ65JJLDHKHRUZI3EUEKMTCH&" +
                "start_time=1512689100000&" +
                "end_time=1512775500000&" +
                "resolution=300000&" +
                "limit=200&" +
                "order=asc", uri.toString());

    }
}

