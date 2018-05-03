package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.additionalDetail.status.Status;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.utils.Objects2;

/**
 */
public class AdditionalDetail {
    public static final AdditionalDetail DEFAULT = new AdditionalDetail();
    AdditionalDetailId additionalDetailId = new AdditionalDetailId(-1);
    private ChargeGroupIdentifier chargeGroupIdentifier = new ChargeGroupIdentifier(-1);
    Event event = EventProvider.newEvent();
    ApprovedStatus approvedStatus = ApprovedStatus.NON_APPROVED;

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("additionalDetailId",additionalDetailId)
                .add("chargeGroupIdentifier", chargeGroupIdentifier)
                .add("event",event)
                .add("approvedStatus",approvedStatus)
                .omitNullValues()
                .toString();
    }

    public AdditionalDetail(AdditionalDetailId anAdditionalDetailId, Event anEvent, ChargeGroupIdentifier aChargeGroupIdentifier, Status anAdditionalDetailStatus) {
        additionalDetailId = anAdditionalDetailId;
        event = anEvent;
        chargeGroupIdentifier = aChargeGroupIdentifier;
    }
    public AdditionalDetail(AdditionalDetailId anAdditionalDetailId, Event anEvent, ChargeGroupIdentifier aChargeGroupIdentifier) {
        additionalDetailId = anAdditionalDetailId;
        event = anEvent;
        chargeGroupIdentifier = aChargeGroupIdentifier;
    }

    AdditionalDetail() {

    }

    public boolean isPresent() {
        return additionalDetailId.isPresent();
    }

    public ChargeGroupIdentifier chargeGroupId() {
        return chargeGroupIdentifier;
    }

    public Event event() {
        return event;

    }

    public AdditionalDetailId additionalDetailId() {
        return additionalDetailId;
    }

    public boolean isApproved() {
        return approvedStatus.isApploved();
    }
}
