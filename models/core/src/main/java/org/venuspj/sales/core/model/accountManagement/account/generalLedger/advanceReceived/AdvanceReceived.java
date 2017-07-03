package org.venuspj.sales.core.model.accountManagement.account.generalLedger.advanceReceived;

import org.venuspj.sales.core.model.accountManagement.account.AbstractAccount;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;

/**
 * 前受金（負債）
 */
public class AdvanceReceived extends AbstractAccount {

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
