package org.rover.sdk;

import org.rover.sdk.xdr.OperationType;

/**
 * Represents <a href="https://www.rover.network/developers/guides/concepts/list-of-operations.html#inflation" target="_blank">Inflation</a> operation.
 * @see <a href="https://www.rover.network/developers/guides/concepts/list-of-operations.html" target="_blank">List of Operations</a>
 */
public class InflationOperation extends Operation {
    @Override
    org.rover.sdk.xdr.Operation.OperationBody toOperationBody() {
        org.rover.sdk.xdr.Operation.OperationBody body = new org.rover.sdk.xdr.Operation.OperationBody();
        body.setDiscriminant(OperationType.INFLATION);
        return body;
    }
}
