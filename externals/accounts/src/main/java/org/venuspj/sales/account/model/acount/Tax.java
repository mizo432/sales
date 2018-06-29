package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;

import static java.util.Objects.isNull;

public class Tax extends AbstractAmountValue<Tax> {

    public Tax(Long value) {
        super(value);

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
        return Amount.yens(value);

    }

    @Override
    public Long asLong() {
        if (isNull(value)) return Long.valueOf(0);
        return value;

    }

    public boolean isEmpty() {
        return isNull(value);

    }

}
