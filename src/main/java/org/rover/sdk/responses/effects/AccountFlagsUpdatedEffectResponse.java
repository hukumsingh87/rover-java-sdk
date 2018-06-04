package org.rover.sdk.responses.effects;

import com.google.gson.annotations.SerializedName;

/**
 * Represents account_flags_updated effect response.
 * @see <a href="https://www.rover.network/developers/orbit/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.rover.sdk.requests.EffectsRequestBuilder
 * @see org.rover.sdk.Server#effects()
 */
public class AccountFlagsUpdatedEffectResponse extends EffectResponse {
  @SerializedName("auth_required_flag")
  protected final Boolean authRequiredFlag;
  @SerializedName("auth_revokable_flag")
  protected final Boolean authRevokableFlag;

  AccountFlagsUpdatedEffectResponse(Boolean authRequiredFlag, Boolean authRevokableFlag) {
    this.authRequiredFlag = authRequiredFlag;
    this.authRevokableFlag = authRevokableFlag;
  }

  public Boolean getAuthRequiredFlag() {
    return authRequiredFlag;
  }

  public Boolean getAuthRevokableFlag() {
    return authRevokableFlag;
  }
}
