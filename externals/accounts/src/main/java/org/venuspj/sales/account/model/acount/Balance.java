package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class Balance implements AmountValue<AbstractAmountValue<AVV>> {
    private Long value;

    public Balance() {

    }

    Balance(Long value) {
        this.value = value;

    }

    public static Balance yenZero() {
        return new Balance(0L);
    }

    public static Balance yens(Long value) {
        return new Balance(value);
    }

    @Override
    public Amount asAmount() {
        return Amount.yen(value);
    }

    @Override
    public Long asLong() {
        return value;
    }
}
