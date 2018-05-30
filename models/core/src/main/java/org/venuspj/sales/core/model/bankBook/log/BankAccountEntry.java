package org.venuspj.sales.core.model.bankBook.log;

import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;
import org.venuspj.sales.account.model.generalLedger.assetAccount.AssetAccount;
import org.venuspj.sales.core.fundamentals.amount.Amount;

/**
 * Created by mizoguchi on 2017/05/21.
 */
public class BankAccountEntry extends AssetAccount<BankAccountEntry> {

    public BankAccountEntry(AccountNumber accountNumber, Amount amount, AccountsSubTitle accountsSubTitle) {
        super(accountNumber, amount, AccountsTitle.BANK_ACCOUNT, accountsSubTitle);

    }

}
