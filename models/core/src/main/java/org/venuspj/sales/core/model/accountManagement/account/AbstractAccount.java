package org.venuspj.sales.core.model.accountManagement.account;

import com.google.common.base.MoreObjects;
import org.venuspj.sales.utils.Objects2;

/**
 */
public abstract class AbstractAccount implements Account {
    AccountNumber number;
    Balance balance;
    AccountsTitle accountsTitle;

    protected AbstractAccount() {

    }

    public AbstractAccount(AccountNumber aNumber,
                           Balance aBalance, AccountsTitle anAccountsTitle) {
        number = aNumber;
        balance = aBalance;
        accountsTitle = anAccountsTitle;

    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("number", number)
                .add("balance", balance)
                .add("accountsTitle", accountsTitle);
    }

}
