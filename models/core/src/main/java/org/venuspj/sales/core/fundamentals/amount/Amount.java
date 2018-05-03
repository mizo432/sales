package org.venuspj.sales.core.fundamentals.amount;

import org.venuspj.sales.utils.Objects2;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

/**
 */
public class Amount {
    Integer value;

    Amount() {

    }

    public Amount(Integer aValue) {
        value = aValue;
    }

    public static Amount zero() {
        return new Amount(0);
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

    public Integer asInteger() {
        return value;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }

}
