package org.venuspj.sales.core.model.deposit;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
                .defaultConfig()
                .toString();
    }
}
