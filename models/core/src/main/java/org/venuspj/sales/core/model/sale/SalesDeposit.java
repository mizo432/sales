package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;

public class SalesDeposit extends AbstractAmountValue<SalesDeposit> {
    public SalesDeposit() {
        super();

    }

    SalesDeposit(Long value) {
        super(value);

    }

    public static SalesDeposit yeans(Long value) {
        return new SalesDeposit(value);
    }
}
