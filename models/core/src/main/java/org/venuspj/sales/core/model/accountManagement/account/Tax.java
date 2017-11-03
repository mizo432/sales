package org.venuspj.sales.core.model.accountManagement.account;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

public class Tax {
    private Integer value;

    public Tax(Integer aValue) {
        value = aValue;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public static Tax createEmpty() {
        return new Tax(null);
    }
}
