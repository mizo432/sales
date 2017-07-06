package org.venuspj.sales.core.model.event.closing;

/**
 * Created by mizoguchi on 2017/07/07.
 */
public enum ClosingStatus {
    CLOSED,OPEND;

    public boolean isClosed() {
        return this == CLOSED;
    }
}
