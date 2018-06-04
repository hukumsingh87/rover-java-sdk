// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union TransactionMeta switch (int v)
//  {
//  case 0:
//      OperationMeta operations<>;
//  };

//  ===========================================================================
public class TransactionMeta  {
  public TransactionMeta () {}
  Integer v;
  public Integer getDiscriminant() {
    return this.v;
  }
  public void setDiscriminant(Integer value) {
    this.v = value;
  }
  private OperationMeta[] operations;
  public OperationMeta[] getOperations() {
    return this.operations;
  }
  public void setOperations(OperationMeta[] value) {
    this.operations = value;
  }
  public static void encode(XdrDataOutputStream stream, TransactionMeta encodedTransactionMeta) throws IOException {
  stream.writeInt(encodedTransactionMeta.getDiscriminant().intValue());
  switch (encodedTransactionMeta.getDiscriminant()) {
  case 0:
  int operationssize = encodedTransactionMeta.getOperations().length;
  stream.writeInt(operationssize);
  for (int i = 0; i < operationssize; i++) {
    OperationMeta.encode(stream, encodedTransactionMeta.operations[i]);
  }
  break;
  }
  }
  public static TransactionMeta decode(XdrDataInputStream stream) throws IOException {
  TransactionMeta decodedTransactionMeta = new TransactionMeta();
  Integer discriminant = stream.readInt();
  decodedTransactionMeta.setDiscriminant(discriminant);
  switch (decodedTransactionMeta.getDiscriminant()) {
  case 0:
  int operationssize = stream.readInt();
  decodedTransactionMeta.operations = new OperationMeta[operationssize];
  for (int i = 0; i < operationssize; i++) {
    decodedTransactionMeta.operations[i] = OperationMeta.decode(stream);
  }
  break;
  }
    return decodedTransactionMeta;
  }
}
