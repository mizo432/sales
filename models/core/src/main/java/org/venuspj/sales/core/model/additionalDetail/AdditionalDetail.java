package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.additionalDetail.status.Status;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.utils.Objects2;

/**
 */
public class AdditionalDetail {
    public static final AdditionalDetail DEFAULT = new AdditionalDetail();
    AdditionalDetailId additionalDetailId = new AdditionalDetailId(-1);
    private ChargeGroupId chargeGroupId = new ChargeGroupId(-1);
    Event event = EventProvider.newEvent();
    ApprovedStatus approvedStatus = ApprovedStatus.NON_APPROVED;

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("additionalDetailId",additionalDetailId)
                .add("chargeGroupId",chargeGroupId)
                .add("event",event)
                .add("approvedStatus",approvedStatus)
                .omitNullValues()
                .toString();
    }

    public AdditionalDetail(AdditionalDetailId anAdditionalDetailId, Event anEvent, ChargeGroupId aChargeGroupId, Status anAdditionalDetailStatus) {
        additionalDetailId = anAdditionalDetailId;
        event = anEvent;
        chargeGroupId = aChargeGroupId;
    }
    public AdditionalDetail(AdditionalDetailId anAdditionalDetailId, Event anEvent, ChargeGroupId aChargeGroupId) {
        additionalDetailId = anAdditionalDetailId;
        event = anEvent;
        chargeGroupId = aChargeGroupId;
    }

    AdditionalDetail() {

    }

    public boolean isPresent() {
        return additionalDetailId.isPresent();
    }

    public ChargeGroupId chargeGroupId() {
        return chargeGroupId;
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
