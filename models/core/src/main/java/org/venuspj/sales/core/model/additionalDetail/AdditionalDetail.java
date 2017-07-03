package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.additionalDetail.status.AdditionalDetailStatus;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

/**
 * Created by mizoguchi on 2017/05/28.
 */
public class AdditionalDetail {
    public static final AdditionalDetail DEFAULT = new AdditionalDetail();
    AdditionalDetailId additionalDetailId = new AdditionalDetailId(-1);
    private ChargeGroupId chargeGroupId = new ChargeGroupId(-1);
    Event event = EventProvider.newEvent();
    AdditionalDetailStatus additionalDetailStatus;

    public AdditionalDetail(AdditionalDetailId anAdditionalDetailId, Event anEvent, ChargeGroupId aChargeGroupId, AdditionalDetailStatus anAdditionalDetailStatus) {
        additionalDetailId = anAdditionalDetailId;
        event = anEvent;
        chargeGroupId = aChargeGroupId;
        additionalDetailStatus = anAdditionalDetailStatus;

    }

    AdditionalDetail() {

    }

    public boolean isPresent() {
        return additionalDetailId.isPresent();
    }

    public boolean isApproved() {
        return additionalDetailStatus.isApproved();
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

}
