package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.partner.PartnerIdentifier;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class ChargeGroup {
    private ChargeGroupIdentifier chargeGroupIdentifier;

    private PartnerIdentifier partnerIdentifier;

    public ChargeGroup(ChargeGroupIdentifier chargeGroupIdentifier,
                       PartnerIdentifier partnerIdentifier) {
        this.chargeGroupIdentifier = chargeGroupIdentifier;
        this.partnerIdentifier = partnerIdentifier;

    }

    public boolean hadClosedInvoice(RecordYearMonth recordYearMonth) {
        return false;

    }

    public boolean hadClosedFutureInvoice(RecordYearMonth recordYearMonth) {
        return false;

    }

    public PartnerIdentifier getPartnerIdentifier() {
        return partnerIdentifier;

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
