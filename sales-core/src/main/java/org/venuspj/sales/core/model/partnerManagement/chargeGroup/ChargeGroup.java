package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

public class ChargeGroup {
    ChargeGroupId chargeGroupId;

    public ChargeGroup(ChargeGroupId aChargeGroupId) {
        chargeGroupId = aChargeGroupId;
    }

    public boolean hadClosedInvoice(RecordYearMonth recordYearMonth) {
        return false;

    }

    public boolean hadClosedFutureInvoice(RecordYearMonth recordYearMonth) {
        return false;
    }
}
