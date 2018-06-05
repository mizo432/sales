package org.venuspj.sales.core.model.materializedClaim.details.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status.Status;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

/**
 */
public class AdditionalDetail {
    public static final AdditionalDetail DEFAULT = new AdditionalDetail();
    AdditionalDetailId additionalDetailId = new AdditionalDetailId(-1);
    private ChargeGroupIdentifier chargeGroupIdentifier = new ChargeGroupIdentifier(-1);
    Event event = EventProvider.newEvent();
    ApprovedStatus approvedStatus = ApprovedStatus.NON_APPROVED;

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
