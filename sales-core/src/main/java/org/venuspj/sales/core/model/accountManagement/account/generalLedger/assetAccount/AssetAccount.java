package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedgerAccount.GeneralLedgerAccount;

/**
 * Created by mizoguchi on 2017/05/21.
 */
public class AssetAccount extends GeneralLedgerAccount {
    public AssetAccount(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance);
    }
}