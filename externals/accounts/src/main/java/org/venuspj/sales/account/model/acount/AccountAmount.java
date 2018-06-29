package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

/**
 * 会計金額.
 */
public class AccountAmount implements AmountValue<AbstractAmountValue<AVV>> {

    Long value;

    public AccountAmount() {

    }

    AccountAmount(Long value) {
        this.value = value;

    }

    public static AccountAmount yenZero() {
        return new AccountAmount(0L);
    }

    @Override
    public Amount asAmount() {
        return Amount.yen(value);
    }

    @Override
    public Long asLong() {
        return value;
    }

    public static AccountAmount yen(Long value) {
        return new AccountAmount(value);

    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof AccountAmount && sameValueAs((AccountAmount) obj);
    }

    private boolean sameValueAs(AccountAmount that) {
        return equal(value, that.value);
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

}
