package org.rover.sdk.responses.effects;

/**
 * Represents trustline_removed effect response.
 * @see <a href="https://www.rover.network/developers/orbit/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.rover.sdk.requests.EffectsRequestBuilder
 * @see org.rover.sdk.Server#effects()
 */
public class TrustlineRemovedEffectResponse extends TrustlineCUDResponse {
  TrustlineRemovedEffectResponse(String limit, String assetType, String assetCode, String assetIssuer) {
    super(limit, assetType, assetCode, assetIssuer);
  }
}
