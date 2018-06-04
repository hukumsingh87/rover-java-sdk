// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union AccountMergeResult switch (AccountMergeResultCode code)
//  {
//  case ACCOUNT_MERGE_SUCCESS:
//      int64 sourceAccountBalance; // how much got transfered from source account
//  default:
//      void;
//  };

//  ===========================================================================
public class AccountMergeResult  {
  public AccountMergeResult () {}
  AccountMergeResultCode code;
  public AccountMergeResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(AccountMergeResultCode value) {
    this.code = value;
  }
  private Int64 sourceAccountBalance;
  public Int64 getSourceAccountBalance() {
    return this.sourceAccountBalance;
  }
  public void setSourceAccountBalance(Int64 value) {
    this.sourceAccountBalance = value;
  }
  public static void encode(XdrDataOutputStream stream, AccountMergeResult encodedAccountMergeResult) throws IOException {
  stream.writeInt(encodedAccountMergeResult.getDiscriminant().getValue());
  switch (encodedAccountMergeResult.getDiscriminant()) {
  case ACCOUNT_MERGE_SUCCESS:
  Int64.encode(stream, encodedAccountMergeResult.sourceAccountBalance);
  break;
  default:
  break;
  }
  }
  public static AccountMergeResult decode(XdrDataInputStream stream) throws IOException {
  AccountMergeResult decodedAccountMergeResult = new AccountMergeResult();
  AccountMergeResultCode discriminant = AccountMergeResultCode.decode(stream);
  decodedAccountMergeResult.setDiscriminant(discriminant);
  switch (decodedAccountMergeResult.getDiscriminant()) {
  case ACCOUNT_MERGE_SUCCESS:
  decodedAccountMergeResult.sourceAccountBalance = Int64.decode(stream);
  break;
  default:
  break;
  }
    return decodedAccountMergeResult;
  }
}
