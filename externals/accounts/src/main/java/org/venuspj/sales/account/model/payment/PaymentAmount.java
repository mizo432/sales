package org.venuspj.sales.account.model.payment;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;

public class PaymentAmount extends AbstractAmountValue<PaymentAmount> {
    private Long value;

    PaymentAmount() {

    }

    PaymentAmount(Long value) {
        this.value = value;
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
