package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

import static java.util.Objects.isNull;
import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class Tax implements AmountValue {
    private Long value;

    public Tax(Long aValue) {
        value = aValue;

    }

    public static Tax empty() {
        return new Tax(null);
    }

    public static Tax yens(Long value) {
        return new Tax(value);
    }

    public static Tax zero() {
        return new Tax(0L);
    }

    @Override
    public Amount asAmount() {
        return Amount.yen(value);

    }

    @Override
    public Long asLong() {
        if (isNull(value)) return Long.valueOf(0);
        return value;

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tax && sameValueAs((Tax) obj);

    }

    private boolean sameValueAs(Tax obj) {
        return equal(value, obj.value);

    }

    public boolean isEmpty() {
        return isNull(value);

    }

    @Override
    public int hashCode() {
        return hash(value);
    }
}
