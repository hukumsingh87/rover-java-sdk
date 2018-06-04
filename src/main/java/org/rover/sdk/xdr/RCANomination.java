// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.rover.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct RCANomination
//  {
//      Hash quorumSetHash; // D
//      Value votes<>;      // X
//      Value accepted<>;   // Y
//  };

//  ===========================================================================
public class RCANomination  {
  public RCANomination () {}
  private Hash quorumSetHash;
  public Hash getQuorumSetHash() {
    return this.quorumSetHash;
  }
  public void setQuorumSetHash(Hash value) {
    this.quorumSetHash = value;
  }
  private Value[] votes;
  public Value[] getVotes() {
    return this.votes;
  }
  public void setVotes(Value[] value) {
    this.votes = value;
  }
  private Value[] accepted;
  public Value[] getAccepted() {
    return this.accepted;
  }
  public void setAccepted(Value[] value) {
    this.accepted = value;
  }
  public static void encode(XdrDataOutputStream stream, RCANomination encodedSCPNomination) throws IOException{
    Hash.encode(stream, encodedSCPNomination.quorumSetHash);
    int votessize = encodedSCPNomination.getVotes().length;
    stream.writeInt(votessize);
    for (int i = 0; i < votessize; i++) {
      Value.encode(stream, encodedSCPNomination.votes[i]);
    }
    int acceptedsize = encodedSCPNomination.getAccepted().length;
    stream.writeInt(acceptedsize);
    for (int i = 0; i < acceptedsize; i++) {
      Value.encode(stream, encodedSCPNomination.accepted[i]);
    }
  }
  public static RCANomination decode(XdrDataInputStream stream) throws IOException {
    RCANomination decodedSCPNomination = new RCANomination();
    decodedSCPNomination.quorumSetHash = Hash.decode(stream);
    int votessize = stream.readInt();
    decodedSCPNomination.votes = new Value[votessize];
    for (int i = 0; i < votessize; i++) {
      decodedSCPNomination.votes[i] = Value.decode(stream);
    }
    int acceptedsize = stream.readInt();
    decodedSCPNomination.accepted = new Value[acceptedsize];
    for (int i = 0; i < acceptedsize; i++) {
      decodedSCPNomination.accepted[i] = Value.decode(stream);
    }
    return decodedSCPNomination;
  }
}
