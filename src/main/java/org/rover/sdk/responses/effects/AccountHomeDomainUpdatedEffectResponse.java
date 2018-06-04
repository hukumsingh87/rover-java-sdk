package org.rover.sdk.responses.effects;

import com.google.gson.annotations.SerializedName;

/**
 * Represents account_home_domain_updated effect response.
 * @see <a href="https://www.rover.network/developers/orbit/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.rover.sdk.requests.EffectsRequestBuilder
 * @see org.rover.sdk.Server#effects()
 */
public class AccountHomeDomainUpdatedEffectResponse extends EffectResponse {
  @SerializedName("home_domain")
  protected final String homeDomain;

  AccountHomeDomainUpdatedEffectResponse(String homeDomain) {
    this.homeDomain = homeDomain;
  }

  public String getHomeDomain() {
    return homeDomain;
  }
}
