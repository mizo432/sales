package org.venuspj.sales.core.model.invoice.issue;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.utils.Objects2;

public class InvoiceIssueId {
    ChargeGroupId chargeGroupId;
    RecordYearMonth recordYearMonth;

    InvoiceIssueId() {

    }

    public InvoiceIssueId(ChargeGroupId aChargeGroupId, RecordYearMonth aRecordYearMonth) {
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
}
