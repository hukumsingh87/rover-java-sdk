// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union OperationResult switch (OperationResultCode code)
//  {
//  case opINNER:
//      union switch (OperationType type)
//      {
//      case CREATE_ACCOUNT:
//          CreateAccountResult createAccountResult;
//      case PAYMENT:
//          PaymentResult paymentResult;
//      case PATH_PAYMENT:
//          PathPaymentResult pathPaymentResult;
//      case MANAGE_OFFER:
//          ManageOfferResult manageOfferResult;
//      case CREATE_PASSIVE_OFFER:
//          ManageOfferResult createPassiveOfferResult;
//      case SET_OPTIONS:
//          SetOptionsResult setOptionsResult;
//      case CHANGE_TRUST:
//          ChangeTrustResult changeTrustResult;
//      case ALLOW_TRUST:
//          AllowTrustResult allowTrustResult;
//      case ACCOUNT_MERGE:
//          AccountMergeResult accountMergeResult;
//      case INFLATION:
//          InflationResult inflationResult;
//      case MANAGE_DATA:
//          ManageDataResult manageDataResult;
//      }
//      tr;
//  default:
//      void;
//  };

//  ===========================================================================
public class OperationResult  {
  public OperationResult () {}
  OperationResultCode code;
  public OperationResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(OperationResultCode value) {
    this.code = value;
  }
  private OperationResultTr tr;
  public OperationResultTr getTr() {
    return this.tr;
  }
  public void setTr(OperationResultTr value) {
    this.tr = value;
  }
  public static void encode(XdrDataOutputStream stream, OperationResult encodedOperationResult) throws IOException {
  stream.writeInt(encodedOperationResult.getDiscriminant().getValue());
  switch (encodedOperationResult.getDiscriminant()) {
  case opINNER:
  OperationResultTr.encode(stream, encodedOperationResult.tr);
  break;
  default:
  break;
  }
  }
  public static OperationResult decode(XdrDataInputStream stream) throws IOException {
  OperationResult decodedOperationResult = new OperationResult();
  OperationResultCode discriminant = OperationResultCode.decode(stream);
  decodedOperationResult.setDiscriminant(discriminant);
  switch (decodedOperationResult.getDiscriminant()) {
  case opINNER:
  decodedOperationResult.tr = OperationResultTr.decode(stream);
  break;
  default:
  break;
  }
    return decodedOperationResult;
  }

  public static class OperationResultTr {
    public OperationResultTr () {}
    OperationType type;
    public OperationType getDiscriminant() {
      return this.type;
    }
    public void setDiscriminant(OperationType value) {
      this.type = value;
    }
    private CreateAccountResult createAccountResult;
    public CreateAccountResult getCreateAccountResult() {
      return this.createAccountResult;
    }
    public void setCreateAccountResult(CreateAccountResult value) {
      this.createAccountResult = value;
    }
    private PaymentResult paymentResult;
    public PaymentResult getPaymentResult() {
      return this.paymentResult;
    }
    public void setPaymentResult(PaymentResult value) {
      this.paymentResult = value;
    }
    private PathPaymentResult pathPaymentResult;
    public PathPaymentResult getPathPaymentResult() {
      return this.pathPaymentResult;
    }
    public void setPathPaymentResult(PathPaymentResult value) {
      this.pathPaymentResult = value;
    }
    private ManageOfferResult manageOfferResult;
    public ManageOfferResult getManageOfferResult() {
      return this.manageOfferResult;
    }
    public void setManageOfferResult(ManageOfferResult value) {
      this.manageOfferResult = value;
    }
    private ManageOfferResult createPassiveOfferResult;
    public ManageOfferResult getCreatePassiveOfferResult() {
      return this.createPassiveOfferResult;
    }
    public void setCreatePassiveOfferResult(ManageOfferResult value) {
      this.createPassiveOfferResult = value;
    }
    private SetOptionsResult setOptionsResult;
    public SetOptionsResult getSetOptionsResult() {
      return this.setOptionsResult;
    }
    public void setSetOptionsResult(SetOptionsResult value) {
      this.setOptionsResult = value;
    }
    private ChangeTrustResult changeTrustResult;
    public ChangeTrustResult getChangeTrustResult() {
      return this.changeTrustResult;
    }
    public void setChangeTrustResult(ChangeTrustResult value) {
      this.changeTrustResult = value;
    }
    private AllowTrustResult allowTrustResult;
    public AllowTrustResult getAllowTrustResult() {
      return this.allowTrustResult;
    }
    public void setAllowTrustResult(AllowTrustResult value) {
      this.allowTrustResult = value;
    }
    private AccountMergeResult accountMergeResult;
    public AccountMergeResult getAccountMergeResult() {
      return this.accountMergeResult;
    }
    public void setAccountMergeResult(AccountMergeResult value) {
      this.accountMergeResult = value;
    }
    private InflationResult inflationResult;
    public InflationResult getInflationResult() {
      return this.inflationResult;
    }
    public void setInflationResult(InflationResult value) {
      this.inflationResult = value;
    }
    private ManageDataResult manageDataResult;
    public ManageDataResult getManageDataResult() {
      return this.manageDataResult;
    }
    public void setManageDataResult(ManageDataResult value) {
      this.manageDataResult = value;
    }
    public static void encode(XdrDataOutputStream stream, OperationResultTr encodedOperationResultTr) throws IOException {
    stream.writeInt(encodedOperationResultTr.getDiscriminant().getValue());
    switch (encodedOperationResultTr.getDiscriminant()) {
    case CREATE_ACCOUNT:
    CreateAccountResult.encode(stream, encodedOperationResultTr.createAccountResult);
    break;
    case PAYMENT:
    PaymentResult.encode(stream, encodedOperationResultTr.paymentResult);
    break;
    case PATH_PAYMENT:
    PathPaymentResult.encode(stream, encodedOperationResultTr.pathPaymentResult);
    break;
    case MANAGE_OFFER:
    ManageOfferResult.encode(stream, encodedOperationResultTr.manageOfferResult);
    break;
    case CREATE_PASSIVE_OFFER:
    ManageOfferResult.encode(stream, encodedOperationResultTr.createPassiveOfferResult);
    break;
    case SET_OPTIONS:
    SetOptionsResult.encode(stream, encodedOperationResultTr.setOptionsResult);
    break;
    case CHANGE_TRUST:
    ChangeTrustResult.encode(stream, encodedOperationResultTr.changeTrustResult);
    break;
    case ALLOW_TRUST:
    AllowTrustResult.encode(stream, encodedOperationResultTr.allowTrustResult);
    break;
    case ACCOUNT_MERGE:
    AccountMergeResult.encode(stream, encodedOperationResultTr.accountMergeResult);
    break;
    case INFLATION:
    InflationResult.encode(stream, encodedOperationResultTr.inflationResult);
    break;
    case MANAGE_DATA:
    ManageDataResult.encode(stream, encodedOperationResultTr.manageDataResult);
    break;
    }
    }
    public static OperationResultTr decode(XdrDataInputStream stream) throws IOException {
    OperationResultTr decodedOperationResultTr = new OperationResultTr();
    OperationType discriminant = OperationType.decode(stream);
    decodedOperationResultTr.setDiscriminant(discriminant);
    switch (decodedOperationResultTr.getDiscriminant()) {
    case CREATE_ACCOUNT:
    decodedOperationResultTr.createAccountResult = CreateAccountResult.decode(stream);
    break;
    case PAYMENT:
    decodedOperationResultTr.paymentResult = PaymentResult.decode(stream);
    break;
    case PATH_PAYMENT:
    decodedOperationResultTr.pathPaymentResult = PathPaymentResult.decode(stream);
    break;
    case MANAGE_OFFER:
    decodedOperationResultTr.manageOfferResult = ManageOfferResult.decode(stream);
    break;
    case CREATE_PASSIVE_OFFER:
    decodedOperationResultTr.createPassiveOfferResult = ManageOfferResult.decode(stream);
    break;
    case SET_OPTIONS:
    decodedOperationResultTr.setOptionsResult = SetOptionsResult.decode(stream);
    break;
    case CHANGE_TRUST:
    decodedOperationResultTr.changeTrustResult = ChangeTrustResult.decode(stream);
    break;
    case ALLOW_TRUST:
    decodedOperationResultTr.allowTrustResult = AllowTrustResult.decode(stream);
    break;
    case ACCOUNT_MERGE:
    decodedOperationResultTr.accountMergeResult = AccountMergeResult.decode(stream);
    break;
    case INFLATION:
    decodedOperationResultTr.inflationResult = InflationResult.decode(stream);
    break;
    case MANAGE_DATA:
    decodedOperationResultTr.manageDataResult = ManageDataResult.decode(stream);
    break;
    }
      return decodedOperationResultTr;
    }

  }
}
