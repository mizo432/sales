package org.venuspj.sales.core.model.bankBook;

import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.Balance;
import org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount.AssetAccount;

/**
 */
public class BankBook extends AssetAccount {

    public BankBook(AccountNumber aNumber, Balance aBalance) {
        super(aNumber, aBalance);
    }
}
