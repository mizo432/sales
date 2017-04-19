package org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount;

import org.venuspj.sales.core.model.accountManagement.account.Account;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.Balance;

public class GeneralLedgerAccount extends Account {

    GeneralLedgerAccount() {
        super();
    }

    public GeneralLedgerAccount(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance);
    }
}
