package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

import static java.util.Objects.isNull;
import static org.venuspj.util.objects2.Objects2.equal;

public class Tax implements AmountValue {
    private Integer value;

    public Tax(Integer aValue) {
        value = aValue;

    }

    public static Tax empty() {
        return new Tax(null);
    }

    public static Tax yens(Integer value) {
        return new Tax(value);
    }

    public static Tax zero() {
        return new Tax(0);
    }

    @Override
    public Amount asAmount() {
        return Amount.yen(value);

    }

    public Integer asInteger() {
        if (isNull(value)) return Integer.valueOf(0);
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tax && sameValueAs((Tax) obj);
    }

    private boolean sameValueAs(Tax obj) {
        return equal(value, obj.value);
    }
}
