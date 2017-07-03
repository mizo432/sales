package org.venuspj.sales.core.model.accountManagement.account;

import com.google.common.base.MoreObjects;
import org.venuspj.sales.utils.Objects2;

/**
 */
public abstract class AbstractAccount implements Account {
    AccountNumber number;
    Balance balance;

    protected AbstractAccount() {

    }

    public AbstractAccount(AccountNumber aNumber,
                           Balance aBalance) {
        number = aNumber;
        balance = aBalance;

    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("number", number)
                .add("balance", balance);
    }

}
