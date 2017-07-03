package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.utils.Objects2;

public class ChargeGroupId {
    private Integer value;

    public ChargeGroupId(Integer aValue) {
        value = aValue;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

}
