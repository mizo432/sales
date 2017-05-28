package org.venuspj.sales.core.model.additionalDetail.status;

import org.venuspj.sales.core.fundamentals.event.Event;

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
}
