package org.venuspj.sales.core.model.bankBook.log;

import org.venuspj.sales.account.model.acount.AccountAmount;
import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;
import org.venuspj.sales.account.model.generalLedger.assetAccount.AssetAccount;

/**
 * Created by mizoguchi on 2017/05/21.
 */
public class BankAccountEntry extends AssetAccount<BankAccountEntry> {

    public BankAccountEntry(AccountNumber accountNumber, AccountAmount accountAmount, AccountsSubTitle accountsSubTitle) {
        super(accountNumber, accountAmount, AccountsTitle.BANK_ACCOUNT, accountsSubTitle);

    }

}
