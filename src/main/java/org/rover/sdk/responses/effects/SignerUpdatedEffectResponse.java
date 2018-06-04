package org.rover.sdk.responses.effects;

/**
 * Represents signed_updated effect response.
 * @see <a href="https://www.rover.network/developers/orbit/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.rover.sdk.requests.EffectsRequestBuilder
 * @see org.rover.sdk.Server#effects()
 */
public class SignerUpdatedEffectResponse extends SignerEffectResponse {
  SignerUpdatedEffectResponse(Integer weight, String publicKey) {
    super(weight, publicKey);
  }
}
