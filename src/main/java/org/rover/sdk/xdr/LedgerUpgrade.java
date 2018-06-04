// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union LedgerUpgrade switch (LedgerUpgradeType type)
//  {
//  case LEDGER_UPGRADE_VERSION:
//      uint32 newLedgerVersion; // update ledgerVersion
//  case LEDGER_UPGRADE_BASE_FEE:
//      uint32 newBaseFee; // update baseFee
//  case LEDGER_UPGRADE_MAX_TX_SET_SIZE:
//      uint32 newMaxTxSetSize; // update maxTxSetSize
//  };

//  ===========================================================================
public class LedgerUpgrade  {
  public LedgerUpgrade () {}
  LedgerUpgradeType type;
  public LedgerUpgradeType getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(LedgerUpgradeType value) {
    this.type = value;
  }
  private Uint32 newLedgerVersion;
  public Uint32 getNewLedgerVersion() {
    return this.newLedgerVersion;
  }
  public void setNewLedgerVersion(Uint32 value) {
    this.newLedgerVersion = value;
  }
  private Uint32 newBaseFee;
  public Uint32 getNewBaseFee() {
    return this.newBaseFee;
  }
  public void setNewBaseFee(Uint32 value) {
    this.newBaseFee = value;
  }
  private Uint32 newMaxTxSetSize;
  public Uint32 getNewMaxTxSetSize() {
    return this.newMaxTxSetSize;
  }
  public void setNewMaxTxSetSize(Uint32 value) {
    this.newMaxTxSetSize = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerUpgrade encodedLedgerUpgrade) throws IOException {
  stream.writeInt(encodedLedgerUpgrade.getDiscriminant().getValue());
  switch (encodedLedgerUpgrade.getDiscriminant()) {
  case LEDGER_UPGRADE_VERSION:
  Uint32.encode(stream, encodedLedgerUpgrade.newLedgerVersion);
  break;
  case LEDGER_UPGRADE_BASE_FEE:
  Uint32.encode(stream, encodedLedgerUpgrade.newBaseFee);
  break;
  case LEDGER_UPGRADE_MAX_TX_SET_SIZE:
  Uint32.encode(stream, encodedLedgerUpgrade.newMaxTxSetSize);
  break;
  }
  }
  public static LedgerUpgrade decode(XdrDataInputStream stream) throws IOException {
  LedgerUpgrade decodedLedgerUpgrade = new LedgerUpgrade();
  LedgerUpgradeType discriminant = LedgerUpgradeType.decode(stream);
  decodedLedgerUpgrade.setDiscriminant(discriminant);
  switch (decodedLedgerUpgrade.getDiscriminant()) {
  case LEDGER_UPGRADE_VERSION:
  decodedLedgerUpgrade.newLedgerVersion = Uint32.decode(stream);
  break;
  case LEDGER_UPGRADE_BASE_FEE:
  decodedLedgerUpgrade.newBaseFee = Uint32.decode(stream);
  break;
  case LEDGER_UPGRADE_MAX_TX_SET_SIZE:
  decodedLedgerUpgrade.newMaxTxSetSize = Uint32.decode(stream);
  break;
  }
    return decodedLedgerUpgrade;
  }
}
