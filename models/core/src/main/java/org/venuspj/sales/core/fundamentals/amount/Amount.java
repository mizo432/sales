package org.venuspj.sales.core.fundamentals.amount;

import org.venuspj.sales.utils.Objects2;

/**
 * 金額を扱うバリューオブジェクト.
 */
public class Amount {

    Integer value;

    Amount() {

    }

    public Amount(Integer value) {
        this.value = value;
    }

    public static Amount yenZero() {
        return new Amount(0);
    }

    public static Amount yen(Integer value) {
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
