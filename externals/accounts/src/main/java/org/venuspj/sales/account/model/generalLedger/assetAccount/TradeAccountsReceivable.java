package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;
import org.venuspj.sales.core.fundamentals.amount.Amount;

public class TradeAccountsReceivable extends AssetAccount<TradeAccountsReceivable> {

    public TradeAccountsReceivable(AccountNumber number,
                                   Amount amount,
                                   AccountsSubTitle accountsSubTitle) {
        super(number,
                amount,
                AccountsTitle.TRADE_ACCOUNTS_RECEIVABLE,
                accountsSubTitle);
    }

    public static class TradeAccountsReceivableBuilder extends AssetAccountBuilder<TradeAccountsReceivable, TradeAccountsReceivableBuilder> {

        @Override
        protected TradeAccountsReceivable createValueObject() {
            return new TradeAccountsReceivable(number, amount, accountsSubTitle);
        }

        @Override
        protected TradeAccountsReceivableBuilder getThis() {
            return this;
        }

        @Override
        protected TradeAccountsReceivableBuilder newInstance() {
            return new TradeAccountsReceivableBuilder();
        }

    }
}
