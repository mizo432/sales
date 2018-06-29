package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;

public class Balance extends AbstractAmountValue<Balance> {

    public Balance() {
        super();

    }

    Balance(Long value) {
        super(value);

    }

    public static Balance yenZero() {
        return new Balance(0L);
    }

    public static Balance yens(Long value) {
        return new Balance(value);
    }

    @Override
    public Amount asAmount() {
        return Amount.yens(value);
    }

    @Override
    public Long asLong() {
        return value;
    }
}
