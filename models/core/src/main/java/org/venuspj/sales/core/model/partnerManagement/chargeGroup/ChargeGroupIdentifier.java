package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

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
}
