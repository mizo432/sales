package org.venuspj.sales.core.fundamentals.amount;

/**
 */
public class Amount {
    Integer value;

    Amount() {

    }

    public Amount(Integer aValue) {
        value = aValue;
    }

    public static Amount yenZero() {
        return new Amount(0);
    }

    public static Amount yen(int value) {
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

    public Integer asInteger() {
        return value;

    }

}
