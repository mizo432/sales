package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.account.model.AccountNumber;
import org.venuspj.sales.account.model.AccountsSubTitle;
import org.venuspj.sales.account.model.AccountsTitle;

public class TradeAccountsReceivable extends AssetAccount {

    public TradeAccountsReceivable(AccountNumber aNumber,
                                   Amount anAmount,
                                   AccountsSubTitle anAccountsSubTitle) {
        super(aNumber,
                anAmount,
                AccountsTitle.TRADE_ACCOUNTS_RECEIVABLE,
                anAccountsSubTitle);
    }
}
