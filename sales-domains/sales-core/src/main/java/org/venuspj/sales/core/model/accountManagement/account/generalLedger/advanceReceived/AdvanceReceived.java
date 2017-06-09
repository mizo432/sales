package org.venuspj.sales.core.model.accountManagement.account.generalLedger.advanceReceived;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount.GeneralLedgerAccount;

public class AdvanceReceived extends GeneralLedgerAccount {

    public AdvanceReceived(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance, AccountsTitle.ADVANCE);
    }
}
