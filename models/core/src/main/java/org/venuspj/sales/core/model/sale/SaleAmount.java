package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class SaleAmount extends AbstractAmountValue<SaleAmount> implements AmountValue<SaleAmount> {

    SaleAmount() {
        super();

    }

    SaleAmount(Long value) {
        super(value);

    }

    SaleAmount yeans(Long value) {
        return new SaleAmount(this.value);
    }

}
