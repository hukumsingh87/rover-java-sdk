package org.rover.sdk.responses.operations;

import com.google.gson.annotations.SerializedName;

/**
 * Represents ManageDataoperation response.
 * @see <a href="https://www.rover.network/developers/orbit/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see org.rover.sdk.requests.OperationsRequestBuilder
 * @see org.rover.sdk.Server#operations()
 */
public class ManageDataOperationResponse extends OperationResponse {
  @SerializedName("name")
  protected final String name;
  @SerializedName("value")
  protected final String value;

  ManageDataOperationResponse(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }
}
