package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

public class Tax implements AmountValue {
    private Integer value;

    public Tax(Integer aValue) {
        value = aValue;

    }

    public static Tax createEmpty() {
        return new Tax(null);
    }

    @Override
    public Amount asAmount() {
        return Amount.yen(value);

    }

}
