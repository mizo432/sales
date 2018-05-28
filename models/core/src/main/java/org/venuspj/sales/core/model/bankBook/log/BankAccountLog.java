package org.venuspj.sales.core.model.bankBook.log;

import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount.AssetAccount;

/**
 * Created by mizoguchi on 2017/05/21.
 */
public class BankAccountLog extends AssetAccount<BankAccountLog> {

    public BankAccountLog(AccountNumber aNumber, Amount amount, AccountsSubTitle accountsSubTitle) {
        super(aNumber, amount, AccountsTitle.BANK_ACCOUNT, accountsSubTitle);

    }
}
