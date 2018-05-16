package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.account.model.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.account.model.TaxClassification;

/**
 */
public abstract class AssetAccount<A extends AssetAccount<A>> extends AbstractAccount<A> {

    public AssetAccount(AccountNumber aNumber,
                        Amount anAmount,
                        AccountsTitle anAccountsTitle,
                        AccountsSubTitle anAccountsSubTitle) {
        super(aNumber, anAmount, AccountsPart.ASSETS, anAccountsTitle, anAccountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

}
