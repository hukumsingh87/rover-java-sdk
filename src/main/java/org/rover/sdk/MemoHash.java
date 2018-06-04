package org.rover.sdk;

import org.rover.sdk.xdr.MemoType;

/**
 * Represents MEMO_HASH.
 */
public class MemoHash extends MemoHashAbstract {
  public MemoHash(byte[] bytes) {
    super(bytes);
  }

  public MemoHash(String hexString) {
    super(hexString);
  }

  @Override
  org.rover.sdk.xdr.Memo toXdr() {
    org.rover.sdk.xdr.Memo memo = new org.rover.sdk.xdr.Memo();
    memo.setDiscriminant(MemoType.MEMO_HASH);

    org.rover.sdk.xdr.Hash hash = new org.rover.sdk.xdr.Hash();
    hash.setHash(bytes);

    memo.setHash(hash);
    return memo;
  }
}
