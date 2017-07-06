package org.venuspj.sales.core.model.additionalDetail.status;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.utils.Objects2;

/**
 */
public class AdditionalDetailStatus {
    Event event;
    ApploveStatus status = ApploveStatus.INITIAL;

    AdditionalDetailStatus() {
    }

    public AdditionalDetailStatus(Event anEvent, ApploveStatus aStatus) {
        status = aStatus;
        event = anEvent;
    }

    public AdditionalDetailStatus(Event aMoment) {
        event = aMoment;
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

    public static AdditionalDetailStatus initialState(Event aMoment) {
        return new AdditionalDetailStatus(aMoment);
    }
}
