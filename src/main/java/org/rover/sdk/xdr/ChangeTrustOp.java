// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct ChangeTrustOp
//  {
//      Asset line;
//  
//      // if limit is set to 0, deletes the trust line
//      int64 limit;
//  };

//  ===========================================================================
public class ChangeTrustOp  {
  public ChangeTrustOp () {}
  private Asset line;
  public Asset getLine() {
    return this.line;
  }
  public void setLine(Asset value) {
    this.line = value;
  }
  private Int64 limit;
  public Int64 getLimit() {
    return this.limit;
  }
  public void setLimit(Int64 value) {
    this.limit = value;
  }
  public static void encode(XdrDataOutputStream stream, ChangeTrustOp encodedChangeTrustOp) throws IOException{
    Asset.encode(stream, encodedChangeTrustOp.line);
    Int64.encode(stream, encodedChangeTrustOp.limit);
  }
  public static ChangeTrustOp decode(XdrDataInputStream stream) throws IOException {
    ChangeTrustOp decodedChangeTrustOp = new ChangeTrustOp();
    decodedChangeTrustOp.line = Asset.decode(stream);
    decodedChangeTrustOp.limit = Int64.decode(stream);
    return decodedChangeTrustOp;
  }
}
