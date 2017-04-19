package org.venuspj.sales.core.model.accountManagement.account;

public class Account {
    AccountNumber number;
    Balance balance;

    protected Account() {

    }

    public Account(AccountNumber aNumber,
                   Balance aBalance) {
        number = aNumber;
        balance = aBalance;

    }
}
