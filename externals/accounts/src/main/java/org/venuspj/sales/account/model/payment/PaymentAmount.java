package org.venuspj.sales.account.model.payment;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class PaymentAmount implements AmountValue {
    private Long value;

    PaymentAmount() {

    }

    PaymentAmount(Long value) {
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
