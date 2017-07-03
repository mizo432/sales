package org.venuspj.sales.core.model.deposit;

import org.venuspj.sales.utils.Objects2;

/**
 */
public class DepositId {
    Integer value;

    DepositId() {

    }

    public DepositId(Integer aValue) {
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
