package org.venuspj.sales.core.model.accountManagement.account.generalLedger.deeposit;

import org.venuspj.sales.core.model.accountManagement.account.AbstractAccount;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;

public class Deposit extends AbstractAccount {
    public Deposit(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance, AccountsTitle.DEPOSIT);
    }
}
