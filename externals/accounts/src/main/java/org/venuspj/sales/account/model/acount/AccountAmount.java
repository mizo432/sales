package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;

/**
 * 会計金額.
 */
public class AccountAmount extends AbstractAmountValue<AccountAmount> {

    public AccountAmount() {
        super();

    }

    AccountAmount(Long value) {
        super(value);

    }

    public static AccountAmount yenZero() {
        return new AccountAmount(0L);
    }

    @Override
    public Amount asAmount() {
        return Amount.yens(value);
    }

    @Override
    public Long asLong() {
        return value;
    }

    public static AccountAmount yen(Long value) {
        return new AccountAmount(value);

    }

}
