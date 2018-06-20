package org.venuspj.sales.application.contract.event.salesManagement.approvingSale;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

/**
 * 複数件の売上を承認する
 */
public interface ApprovingSales {
    void doIt(ChargeGroupIdentifier chargeGroupIdentifier, RecordYearMonth recordYearMonth);
}
