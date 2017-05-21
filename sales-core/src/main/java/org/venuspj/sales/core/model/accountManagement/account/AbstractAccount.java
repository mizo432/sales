package org.venuspj.sales.core.model.accountManagement.account;

/**
 * Created by mizoguchi on 2017/05/21.
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
}
