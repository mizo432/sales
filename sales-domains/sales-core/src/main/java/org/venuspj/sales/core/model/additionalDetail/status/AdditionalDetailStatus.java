package org.venuspj.sales.core.model.additionalDetail.status;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.utils.Objects2;

/**
 */
public class AdditionalDetailStatus {
    Event event;
    Status status;

    AdditionalDetailStatus() {
    }

    public AdditionalDetailStatus(Event anEvent, Status aStatus) {
        status = aStatus;
        event = anEvent;
    }

    public boolean isApproved() {
        return status.isApproved();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("event", event)
                .add("status", status)
                .omitNullValues()
                .toString();
    }

    public enum INITIAL_STATUS {}
}
