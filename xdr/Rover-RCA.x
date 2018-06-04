// Copyright 2018 Rover Network and contributors.
// Copyright 2015 Stellar Development Foundation and contributors. Licensed
// under the Apache License, Version 2.0. See the COPYING file at the root
// of this distribution or at http://www.apache.org/licenses/LICENSE-2.0

%#include "xdr/Rover-types.h"

namespace stellar
{

typedef opaque Value<>;

struct RCABallot
{
    uint32 counter; // n
    Value value;    // x
};

enum RCAStatementType
{
    SCP_ST_PREPARE = 0,
    SCP_ST_CONFIRM = 1,
    SCP_ST_EXTERNALIZE = 2,
    SCP_ST_NOMINATE = 3
};

struct RCANomination
{
    Hash quorumSetHash; // D
    Value votes<>;      // X
    Value accepted<>;   // Y
};

struct RCAStatement
{
    NodeID nodeID;    // v
    uint64 slotIndex; // i

    union switch (RCAStatementType type)
    {
    case SCP_ST_PREPARE:
        struct
        {
            Hash quorumSetHash;       // D
            RCABallot ballot;         // b
            RCABallot* prepared;      // p
            RCABallot* preparedPrime; // p'
            uint32 nC;                // c.n
            uint32 nH;                // h.n
        } prepare;
    case SCP_ST_CONFIRM:
        struct
        {
            RCABallot ballot;   // b
            uint32 nPrepared;   // p.n
            uint32 nCommit;     // c.n
            uint32 nH;          // h.n
            Hash quorumSetHash; // D
        } confirm;
    case SCP_ST_EXTERNALIZE:
        struct
        {
            RCABallot commit;         // c
            uint32 nH;                // h.n
            Hash commitQuorumSetHash; // D used before EXTERNALIZE
        } externalize;
    case SCP_ST_NOMINATE:
        RCANomination nominate;
    }
    pledges;
};

struct RCAEnvelope
{
    RCAStatement statement;
    Signature signature;
};

// supports things like: A,B,C,(D,E,F),(G,H,(I,J,K,L))
// only allows 2 levels of nesting
struct RCAQuorumSet
{
    uint32 threshold;
    PublicKey validators<>;
    RCAQuorumSet innerSets<>;
};
}
