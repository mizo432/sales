package org.venuspj.sales.core.model.invoice.issue;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class InvoiceIssueId {
    private ChargeGroupIdentifier chargeGroupIdentifier;
    private RecordYearMonth recordYearMonth;

    InvoiceIssueId() {

    }

    public InvoiceIssueId(ChargeGroupIdentifier chargeGroupIdentifier, RecordYearMonth recordYearMonth) {
        this.chargeGroupIdentifier = chargeGroupIdentifier;
        this.recordYearMonth = recordYearMonth;

    }

    public ChargeGroupIdentifier getChargeGroupIdentifier() {
        return chargeGroupIdentifier;
    }

    public RecordYearMonth getRecordYearMonth() {
        return recordYearMonth;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
