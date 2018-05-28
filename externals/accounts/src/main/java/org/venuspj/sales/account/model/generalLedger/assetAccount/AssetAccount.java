package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;

/**
 */
public abstract class AssetAccount<A extends AssetAccount<A>> extends AbstractAccount<A> {
    public AssetAccount(AccountNumber aNumber,
                        Amount anAmount,
                        AccountsTitle anAccountsTitle,
                        AccountsSubTitle anAccountsSubTitle) {
        super(aNumber, anAmount, AccountsPart.ASSETS, anAccountsTitle, anAccountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

    public static abstract class AssetAccountBuilder<A extends AssetAccount<A>,B extends AssetAccountBuilder<A,B>> extends AbstractAccountBuilder<A,B> {

    }

}
