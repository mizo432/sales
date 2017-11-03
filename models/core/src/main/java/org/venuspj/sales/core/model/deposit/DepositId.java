package org.venuspj.sales.core.model.deposit;

import org.venuspj.sales.utils.Objects2;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

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
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
