package org.venuspj.sales.usecase.addtionalDetailManagement;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

/**
 */
public class ClosingCredential {
    ChargeGroupIdentifier chargeGroupIdentifier;
    RecordYearMonth recordYearMonth;

    public ClosingCredential(ChargeGroupIdentifier aChargeGroupIdentifier, RecordYearMonth aRecordYearMonth) {
        chargeGroupIdentifier = aChargeGroupIdentifier;
        recordYearMonth = aRecordYearMonth;
    }

    public static ClosingCredential of(ChargeGroupIdentifier chargeGroupIdentifier, Event aMoment) {
        return new ClosingCredential(chargeGroupIdentifier, aMoment.whenOccurredYearMonth());
    }
}
