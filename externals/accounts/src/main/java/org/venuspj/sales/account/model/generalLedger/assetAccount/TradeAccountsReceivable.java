package org.venuspj.sales.account.model.generalLedger.assetAccount;

import org.venuspj.sales.account.model.acount.AccountAmount;
import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.AccountsSubTitle;
import org.venuspj.sales.account.model.acount.AccountsTitle;

public class TradeAccountsReceivable extends AssetAccount<TradeAccountsReceivable> {

    public TradeAccountsReceivable(AccountNumber number,
                                   AccountAmount accountAmount,
                                   AccountsSubTitle accountsSubTitle) {
        super(number,
                accountAmount,
                AccountsTitle.TRADE_ACCOUNTS_RECEIVABLE,
                accountsSubTitle);
    }

    public static class TradeAccountsReceivableBuilder extends AssetAccountBuilder<TradeAccountsReceivable, TradeAccountsReceivableBuilder> {

        @Override
        public TradeAccountsReceivableBuilder withAccountNumber(AccountNumber accountNumber) {
            return super.withAccountNumber(this.accountNumber);
        }

        @Override
        public TradeAccountsReceivableBuilder withAccountAmount(AccountAmount accountAmount) {
            return super.withAccountAmount(accountAmount);
        }

        @Override
        protected TradeAccountsReceivable createValueObject() {
            return new TradeAccountsReceivable(accountNumber, accountAmount, accountsSubTitle);
        }

        @Override
        protected void apply(TradeAccountsReceivable vo, TradeAccountsReceivableBuilder builder) {
            super.apply(vo, builder);
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
