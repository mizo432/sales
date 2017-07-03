package org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount;

import org.venuspj.sales.core.model.accountManagement.account.AbstractAccount;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;

public class GeneralLedgerAccount extends AbstractAccount {

    GeneralLedgerAccount() {
        super();
    }

    public GeneralLedgerAccount(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance, AccountsTitle.ADVANCE);
    }
}
