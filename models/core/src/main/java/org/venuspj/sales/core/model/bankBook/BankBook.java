package org.venuspj.sales.core.model.bankBook;

import org.venuspj.sales.account.model.acount.AccountAmount;
import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;
import org.venuspj.sales.account.model.generalLedger.assetAccount.AssetAccount;

/**
 */
public class BankBook extends AssetAccount {

    public BankBook(AccountNumber number, AccountAmount accountAmount, AccountsTitle accountsTitle,
                    AccountsSubTitle accountsSubTitle) {
        super(number, accountAmount, accountsTitle, accountsSubTitle);
    }
}
