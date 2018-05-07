package org.venuspj.sales.core.model.additionalDetail.status;

import org.venuspj.sales.core.fundamentals.event.Event;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }

    public static AdditionalDetailStatus initialState(Event moment) {
        return new AdditionalDetailStatus(moment);
    }
}
