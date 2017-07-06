package org.venuspj.sales.core.model.event.closing;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

/**
 */
public class Closing {
    ClosingId closingId;
    Event moment;
    ClosingStatus closingStatus;

    Closing(ChargeGroupId aChargeGroupId, Event aMoment, ClosingStatus aClosingStatus) {
        closingId = new ClosingId(aChargeGroupId, aMoment.recordDatetime().recordYearMonth());
        moment = aMoment;
        closingStatus = aClosingStatus;
    }

    Closing() {

    }

    public Closing(ClosingId aClosingId, Event aMoment, ClosingStatus aClosingStatus) {
        closingId = aClosingId;
        moment = aMoment;
        closingStatus = aClosingStatus;
    }

    public boolean isPresent() {
        return closingId.isPresent();

    }

    public ClosingStatus closingStatus() {
        return closingStatus;
    }

    public Closing reopen() {
        return new Closing(closingId, moment, ClosingStatus.OPEND);
    }
}
