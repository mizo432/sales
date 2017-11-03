package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.*;

/**
 */
public abstract class AssetAccount extends AbstractAccount {
    public AssetAccount(AccountNumber aNumber,
                        Amount anAmount,
                        AccountsTitle anAccountsTitle,
                        AccountsSubTitle anAccountsSubTitle) {
        super(aNumber, anAmount, AccountsPart.ASSETS, anAccountsTitle, anAccountsSubTitle, Tax.createEmpty(), TaxClassification.EXCLUDES);
    }

}
