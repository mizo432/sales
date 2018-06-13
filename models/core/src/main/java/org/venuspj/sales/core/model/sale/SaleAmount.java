package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class SaleAmount implements AmountValue {
    private Long value;


    SaleAmount(Long value) {
        this.value = value;

    }

    @Override
    public Amount asAmount() {
        return new Amount(value);

    }

    @Override
    public Long asLong() {
        return value;
    }
}
