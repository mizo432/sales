package org.venuspj.sales.core.model.accountManagement.account.generalLedger.liabilitiesAcount;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount.GeneralLedgerAccount;

public class Liabilities extends GeneralLedgerAccount {
    public Liabilities(AccountNumber anAccountNumber, Balance abalance) {
        super(anAccountNumber,abalance, AccountsTitle.LIABILITIES);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
