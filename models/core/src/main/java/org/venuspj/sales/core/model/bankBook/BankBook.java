package org.venuspj.sales.core.model.bankBook;

import org.venuspj.sales.account.model.AccountNumber;
import org.venuspj.sales.account.model.AccountsSubTitle;
import org.venuspj.sales.account.model.AccountsTitle;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount.AssetAccount;

/**
 */
public class BankBook extends AssetAccount {

    public BankBook(AccountNumber number, Amount amount, AccountsTitle accountsTitle,
                    AccountsSubTitle accountsSubTitle) {
        super(number, amount, accountsTitle, accountsSubTitle);
    }
}
