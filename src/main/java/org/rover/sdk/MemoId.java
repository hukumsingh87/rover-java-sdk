package org.rover.sdk;

import org.rover.sdk.xdr.MemoType;
import org.rover.sdk.xdr.Uint64;

/**
 * Represents MEMO_ID.
 */
public class MemoId extends Memo {
  private long id;

  public MemoId(long id) {
    if (id < 0) {
      throw new IllegalArgumentException("id must be a positive number");
    }
    this.id = id;
  }

  public long getId() {
    return id;
  }

  @Override
  org.rover.sdk.xdr.Memo toXdr() {
    org.rover.sdk.xdr.Memo memo = new org.rover.sdk.xdr.Memo();
    memo.setDiscriminant(MemoType.MEMO_ID);
    Uint64 idXdr = new Uint64();
    idXdr.setUint64(id);
    memo.setId(idXdr);
    return memo;
  }
}
