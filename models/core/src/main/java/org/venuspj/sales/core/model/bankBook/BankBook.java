package org.venuspj.sales.core.model.bankBook;

import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;
import org.venuspj.sales.account.model.generalLedger.assetAccount.AssetAccount;
import org.venuspj.sales.core.fundamentals.amount.Amount;

/**
 */
public class BankBook extends AssetAccount {

    public BankBook(AccountNumber number, Amount amount, AccountsTitle accountsTitle,
                    AccountsSubTitle accountsSubTitle) {
        super(number, amount, accountsTitle, accountsSubTitle);
    }
}
