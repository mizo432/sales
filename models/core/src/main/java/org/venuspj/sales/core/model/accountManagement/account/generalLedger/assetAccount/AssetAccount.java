package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount.GeneralLedgerAccount;

/**
 */
public class AssetAccount extends GeneralLedgerAccount {
    public AssetAccount(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance, AccountsTitle.ASSET);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
