package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

import static org.venuspj.sales.utils.Objects2.isNull;

public class Tax implements AmountValue {
    private Integer value;

    Tax() {

    }

    private Tax(Integer value) {
        this.value = value;

    }

    public static Tax yenZero() {
        return new Tax(0);
    }

    public static Tax yen(Integer value) {
        return new Tax(value);

    }

    @Override
    public Amount asAmount() {
        return new Amount(value);
    }

    public Integer asInteger() {
        if (isNull(value)) return 0;
        return value;
    }
}
