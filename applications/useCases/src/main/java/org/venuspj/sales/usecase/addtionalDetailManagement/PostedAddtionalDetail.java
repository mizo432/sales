package org.venuspj.sales.usecase.addtionalDetailManagement;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.invoice.details.additionalDetail.AdditionalDetailId;

/**
 */
public class PostedAddtionalDetail {
    AdditionalDetailId additionalDetailId;
    Event moment;

    public PostedAddtionalDetail(AdditionalDetailId anAdditionalDetailId, Event aMoment) {
        additionalDetailId = anAdditionalDetailId;
        moment = aMoment;
    }

    public static PostedAddtionalDetail of(AdditionalDetailId additionalDetailId, Event moment) {
        return new PostedAddtionalDetail(additionalDetailId, moment);
    }
}
