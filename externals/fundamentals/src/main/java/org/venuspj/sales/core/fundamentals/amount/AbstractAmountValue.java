package org.venuspj.sales.core.fundamentals.amount;

import org.venuspj.ddd.model.value.AbstractLongValue;

public class AbstractAmountValue<AVV extends AbstractAmountValue<AVV>> extends AbstractLongValue<AVV> implements AmountValue<AVV> {
    protected AbstractAmountValue() {
        super();
    }

    protected AbstractAmountValue(Long value) {
        super(value);
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
