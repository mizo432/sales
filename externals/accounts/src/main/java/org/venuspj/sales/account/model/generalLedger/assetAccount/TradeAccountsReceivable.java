package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.account.model.AccountNumber;
import org.venuspj.sales.account.model.AccountsSubTitle;
import org.venuspj.sales.account.model.AccountsTitle;

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
