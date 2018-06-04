package org.rover.sdk;

import org.rover.sdk.xdr.MemoType;

/**
 * Represents MEMO_NONE.
 */
public class MemoNone extends Memo {
  @Override
  org.rover.sdk.xdr.Memo toXdr() {
    org.rover.sdk.xdr.Memo memo = new org.rover.sdk.xdr.Memo();
    memo.setDiscriminant(MemoType.MEMO_NONE);
    return memo;
  }
}
