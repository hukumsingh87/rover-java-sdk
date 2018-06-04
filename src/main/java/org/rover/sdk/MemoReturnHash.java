package org.rover.sdk;

import org.rover.sdk.xdr.Memo;
import org.rover.sdk.xdr.MemoType;

/**
 * Represents MEMO_RETURN.
 */
public class MemoReturnHash extends MemoHashAbstract {
  public MemoReturnHash(byte[] bytes) {
    super(bytes);
  }

  public MemoReturnHash(String hexString) {
    super(hexString);
  }

  @Override
  Memo toXdr() {
    org.rover.sdk.xdr.Memo memo = new org.rover.sdk.xdr.Memo();
    memo.setDiscriminant(MemoType.MEMO_RETURN);

    org.rover.sdk.xdr.Hash hash = new org.rover.sdk.xdr.Hash();
    hash.setHash(bytes);

    memo.setHash(hash);
    return memo;
  }
}
