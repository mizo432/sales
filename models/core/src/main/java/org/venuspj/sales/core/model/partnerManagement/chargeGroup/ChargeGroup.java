package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.customer.CustomerIdentifier;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class ChargeGroup {
    private ChargeGroupIdentifier chargeGroupIdentifier;

    private CustomerIdentifier customerIdentifier;

    public ChargeGroup(ChargeGroupIdentifier chargeGroupIdentifier,
                       CustomerIdentifier customerIdentifier) {
        this.chargeGroupIdentifier = chargeGroupIdentifier;
        this.customerIdentifier = customerIdentifier;

    }

    public boolean hadClosedInvoice(RecordYearMonth recordYearMonth) {
        return false;

    }

    public boolean hadClosedFutureInvoice(RecordYearMonth recordYearMonth) {
        return false;

    }

    public CustomerIdentifier getCustomerIdentifier() {
        return customerIdentifier;

    }

    public ChargeGroupIdentifier getChargeGroupIdentifier() {
        return chargeGroupIdentifier;

    }

    @Override
    public int hashCode() {
        return hash(chargeGroupIdentifier);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ChargeGroup && sameIdentifierAs((ChargeGroup) obj);

    }

    public boolean sameIdentifierAs(ChargeGroup other) {
        return equal(chargeGroupIdentifier, other.chargeGroupIdentifier);

    }
}
