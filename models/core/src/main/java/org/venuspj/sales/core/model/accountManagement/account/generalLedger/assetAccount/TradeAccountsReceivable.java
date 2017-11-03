package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsSubTitle;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;

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
