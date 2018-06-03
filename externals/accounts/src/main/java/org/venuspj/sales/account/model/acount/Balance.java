package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class Balance implements AmountValue {
    private Long value;

    Balance() {

    }

    public Balance(Long value) {
        this.value = value;

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
