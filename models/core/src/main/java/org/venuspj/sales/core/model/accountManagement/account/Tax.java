package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class Tax implements AmountValue {
    private Integer value;

    public Tax(Integer aValue) {
        value = aValue;

    }

    public static Tax empty() {
        return new Tax(null);
    }

    public static Tax yens(Integer value) {
        return new Tax(value);
    }

    public static Tax zero() {
        return new Tax(0);
    }

    @Override
    public Amount asAmount() {
        return Amount.yen(value);

    }

    public Integer asInteger() {
        return value;
    }
}
