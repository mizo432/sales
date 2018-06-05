package org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status;

import org.venuspj.sales.core.fundamentals.event.Event;

/**
 */
public class AdditionalDetailStatus {

    private Event event;

    private ApploveStatus status = ApploveStatus.INITIAL;

    AdditionalDetailStatus() {

    }

    public AdditionalDetailStatus(Event event, ApploveStatus status) {
        this.status = status;
        this.event = event;
    }

    public boolean isApproved() {
        return status.isApproved();
    }

    public Event getEvent() {
        return event;
    }

    public static AdditionalDetailStatus initialState(Event moment) {
        return new AdditionalDetailStatus(moment, ApploveStatus.INITIAL);

    }
}
