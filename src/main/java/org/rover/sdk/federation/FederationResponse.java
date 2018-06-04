package org.rover.sdk.federation;

import com.google.gson.annotations.SerializedName;

/**
 * Object to hold a response from a federation server.
 * @see <a href="https://www.rover.network/developers/guides/concepts/federation.html" target="_blank">Federation docs</a>
 */
public class FederationResponse {
  @SerializedName("rover_address")
  private final String roverAddress;
  @SerializedName("account_id")
  private final String accountId;
  @SerializedName("memo_type")
  private final String memoType;
  @SerializedName("memo")
  private final String memo;

  public FederationResponse(String roverAddress, String accountId, String memoType, String memo) {
    this.roverAddress = roverAddress;
    this.accountId = accountId;
    this.memoType = memoType;
    this.memo = memo;
  }

  public String getRoverAddress() {
    return roverAddress;
  }

  public String getAccountId() {
    return accountId;
  }

  /**
   * @return Memo type or null when no memo attached
   */
  public String getMemoType() {
    return memoType;
  }

  /**
   * @return Memo value or null when no memo attached
   */
  public String getMemo() {
    return memo;
  }
}
