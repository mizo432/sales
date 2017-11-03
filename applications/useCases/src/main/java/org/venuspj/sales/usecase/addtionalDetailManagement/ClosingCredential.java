package org.venuspj.sales.usecase.addtionalDetailManagement;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.utils.Objects2;

/**
 */
public class ClosingCredential {
    ChargeGroupId chargeGroupId;
    RecordYearMonth recordYearMonth;

    public ClosingCredential(ChargeGroupId aChargeGroupId, RecordYearMonth aRecordYearMonth) {
        chargeGroupId = aChargeGroupId;
        recordYearMonth = aRecordYearMonth;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("chargeGroupId", chargeGroupId)
                .add("recordYearMonth", recordYearMonth)
                .omitNullValues()
                .toString();
    }

    public static ClosingCredential of(ChargeGroupId aChargeGroupId, Event aMoment) {
        return new ClosingCredential(aChargeGroupId, aMoment.recordYearMonth());
    }
}
