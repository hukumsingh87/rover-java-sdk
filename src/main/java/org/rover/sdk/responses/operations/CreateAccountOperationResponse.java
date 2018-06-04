package org.rover.sdk.responses.operations;

import com.google.gson.annotations.SerializedName;

import org.rover.sdk.KeyPair;

/**
 * Represents CreateAccount operation response.
 * @see <a href="https://www.rover.network/developers/orbit/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see org.rover.sdk.requests.OperationsRequestBuilder
 * @see org.rover.sdk.Server#operations()
 */
public class CreateAccountOperationResponse extends OperationResponse {
  @SerializedName("account")
  protected final KeyPair account;
  @SerializedName("funder")
  protected final KeyPair funder;
  @SerializedName("starting_balance")
  protected final String startingBalance;

  CreateAccountOperationResponse(KeyPair funder, String startingBalance, KeyPair account) {
    this.funder = funder;
    this.startingBalance = startingBalance;
    this.account = account;
  }

  public KeyPair getAccount() {
    return account;
  }

  public String getStartingBalance() {
    return startingBalance;
  }

  public KeyPair getFunder() {
    return funder;
  }
}
