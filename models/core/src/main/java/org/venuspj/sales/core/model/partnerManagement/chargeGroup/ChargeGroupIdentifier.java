package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;
import static org.venuspj.util.objects2.Objects2.nonNull;

public class ChargeGroupIdentifier {
    private Integer value;

    public ChargeGroupIdentifier(Integer aValue) {
        value = aValue;

    }

    public ChargeGroupIdentifier() {

    }

    public boolean isPresent() {
        return nonNull(value);

    }

    @Override
    public int hashCode() {
        return hash(value);

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ChargeGroupIdentifier && sameValueAs((ChargeGroupIdentifier) obj);

    }

    public boolean sameValueAs(ChargeGroupIdentifier other) {
        return equal(value, other.value);

    }
}
