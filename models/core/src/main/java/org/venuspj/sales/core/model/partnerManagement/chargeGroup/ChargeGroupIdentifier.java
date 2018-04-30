package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.utils.Objects2;

public class ChargeGroupIdentifier {
    private Integer value;

    public ChargeGroupIdentifier(Integer aValue) {
        value = aValue;

    }

    public ChargeGroupIdentifier() {

    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }
}
