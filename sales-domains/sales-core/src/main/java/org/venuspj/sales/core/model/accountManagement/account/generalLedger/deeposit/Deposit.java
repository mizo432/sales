package org.venuspj.sales.core.model.accountManagement.account.generalLedger.deeposit;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount.GeneralLedgerAccount;

public class Deposit extends GeneralLedgerAccount {
    public Deposit(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance, AccountsTitle.DEPOSIT);
    }
}
