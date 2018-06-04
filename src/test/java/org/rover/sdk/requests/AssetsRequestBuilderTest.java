package org.rover.sdk.requests;

import okhttp3.HttpUrl;
import org.junit.Test;
import org.rover.sdk.Server;

import static org.junit.Assert.assertEquals;

public class AssetsRequestBuilderTest {
    @Test
    public void testAccounts() {
        Server server = new Server("https://orbit-testnet.rover.network");
        HttpUrl uri = server.assets()
                .assetCode("USD")
                .assetIssuer("GDSBCQO34HWPGUGQSP3QBFEXVTSR2PW46UIGTHVWGWJGQKH3AFNHXHXN")
                .cursor("13537736921089")
                .limit(200)
                .order(RequestBuilder.Order.ASC)
                .buildUri();
        assertEquals("https://orbit-testnet.rover.network/assets?asset_code=USD&asset_issuer=GDSBCQO34HWPGUGQSP3QBFEXVTSR2PW46UIGTHVWGWJGQKH3AFNHXHXN&cursor=13537736921089&limit=200&order=asc", uri.toString());
    }
}
