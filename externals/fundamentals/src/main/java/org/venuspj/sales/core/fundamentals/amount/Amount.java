package org.venuspj.sales.core.fundamentals.amount;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

/**
 */
public class Amount {
    Long value;

    public Amount() {

    }

    public Amount(Long aValue) {
        value = aValue;
    }

    public static Amount yenZero() {
        return new Amount(0L);
    }

    public static Amount yen(Long value) {
        return new Amount(value);

    }

    public Amount plus(Amount amount) {
        return new Amount(value + amount.value);

    }

    public Amount minus(Amount amount) {
        return new Amount(value - amount.value);

    }

    public boolean isMoreThan(Amount other) {
        return value > other.value;
    }

    public boolean isSmallThan(Amount other) {
        return value < other.value;
    }

    public Long asLong() {
        return value;

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Amount && sameValueAs((Amount) obj);
    }

    private boolean sameValueAs(Amount that) {
        return equal(value, that.value);
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isSmallOrEqual(Amount other) {
        return value < other.value;
    }
}
