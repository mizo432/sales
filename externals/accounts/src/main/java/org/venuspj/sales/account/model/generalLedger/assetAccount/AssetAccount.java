package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;

/**
 * 資産会計
 */
public abstract class AssetAccount<A extends AssetAccount<A>> extends AbstractAccount<A> {
    public AssetAccount(AccountNumber accountNumber,
                        Amount amount,
                        AccountsTitle accountsTitle,
                        AccountsSubTitle accountsSubTitle) {
        super(accountNumber, amount, AccountsPart.ASSETS, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

    public static abstract class AssetAccountBuilder<A extends AssetAccount<A>, B extends AssetAccountBuilder<A, B>> extends AbstractAccountBuilder<A, B> {

    }

}
