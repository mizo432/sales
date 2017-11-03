package org.venuspj.sales.core.usecase.salesManagement.approvingSale;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

/**
 * 売上を承認する
 */
public interface ApprovingSale {
    void doIt(ChargeGroupId aChargeGroupId, RecordYearMonth aRecordYearMonth);
}
