package org.venuspj.sales.core.model.accountManagement.account.generalLedger.advanceReceived;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount.GeneralLedgerAccount;

/**
 * 前受金（負債）
 */
public class AdvanceReceived extends GeneralLedgerAccount {

    public AdvanceReceived(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance, AccountsTitle.ADVANCE);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
