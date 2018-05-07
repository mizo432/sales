package org.venuspj.sales.core.model.invoice.issue;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
