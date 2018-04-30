package org.venuspj.sales.core.model.invoice.issue;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.utils.Objects2;

public class InvoiceIssueId {
    ChargeGroupIdentifier chargeGroupIdentifier;
    RecordYearMonth recordYearMonth;

    InvoiceIssueId() {

    }

    public InvoiceIssueId(ChargeGroupIdentifier aChargeGroupIdentifier, RecordYearMonth aRecordYearMonth) {
        chargeGroupIdentifier = aChargeGroupIdentifier;
        recordYearMonth = aRecordYearMonth;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("chargeGroupIdentifier", chargeGroupIdentifier)
                .add("recordYearMonth", recordYearMonth)
                .omitNullValues()
                .toString();
    }
}
