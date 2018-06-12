package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.account.model.acount.*;

/**
 * 資産会計
 */
public abstract class AssetAccount<A extends AssetAccount<A>> extends AbstractAccount<A> {
    public AssetAccount() {

    }

    protected AssetAccount(AccountNumber accountNumber,
                           AccountAmount accountAmount,
                           AccountsTitle accountsTitle,
                           AccountsSubTitle accountsSubTitle) {
        super(accountNumber, accountAmount, AccountsPart.ASSETS, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

    public static abstract class AssetAccountBuilder<A extends AssetAccount<A>, B extends AssetAccountBuilder<A, B>> extends AbstractAccountBuilder<A, B> {
    }

}
