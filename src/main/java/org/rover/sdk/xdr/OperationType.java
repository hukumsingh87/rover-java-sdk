// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum OperationType
//  {
//      CREATE_ACCOUNT = 0,
//      PAYMENT = 1,
//      PATH_PAYMENT = 2,
//      MANAGE_OFFER = 3,
//      CREATE_PASSIVE_OFFER = 4,
//      SET_OPTIONS = 5,
//      CHANGE_TRUST = 6,
//      ALLOW_TRUST = 7,
//      ACCOUNT_MERGE = 8,
//      INFLATION = 9,
//      MANAGE_DATA = 10
//  };

//  ===========================================================================
public enum OperationType  {
  CREATE_ACCOUNT(0),
  PAYMENT(1),
  PATH_PAYMENT(2),
  MANAGE_OFFER(3),
  CREATE_PASSIVE_OFFER(4),
  SET_OPTIONS(5),
  CHANGE_TRUST(6),
  ALLOW_TRUST(7),
  ACCOUNT_MERGE(8),
  INFLATION(9),
  MANAGE_DATA(10),
  ;
  private int mValue;

  OperationType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static OperationType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return CREATE_ACCOUNT;
      case 1: return PAYMENT;
      case 2: return PATH_PAYMENT;
      case 3: return MANAGE_OFFER;
      case 4: return CREATE_PASSIVE_OFFER;
      case 5: return SET_OPTIONS;
      case 6: return CHANGE_TRUST;
      case 7: return ALLOW_TRUST;
      case 8: return ACCOUNT_MERGE;
      case 9: return INFLATION;
      case 10: return MANAGE_DATA;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, OperationType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
