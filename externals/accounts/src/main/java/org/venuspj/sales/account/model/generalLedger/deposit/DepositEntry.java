package org.venuspj.sales.account.model.generalLedger.deposit;

import org.venuspj.sales.account.model.acount.*;

/**
 * 預り金勘定科目
 */
public class DepositEntry extends AbstractAccount<DepositEntry> {

    public DepositEntry(AccountNumber number,
                        AccountAmount accountAmount,
                        AccountsTitle accountsTitle,
                        AccountsSubTitle accountsSubTitle) {
        super(number, accountAmount, AccountsPart.LIABILITIES, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);

    }


    public static class DepositBuilder extends AbstractAccountBuilder<DepositEntry, DepositBuilder> {
        @Override
        public DepositBuilder withAccountNumber(AccountNumber accountNumber) {
            return super.withAccountNumber(this.accountNumber);
        }

        @Override
        public DepositBuilder withAccountAmount(AccountAmount accountAmount) {
            return super.withAccountAmount(accountAmount);
        }

        @Override
        protected void apply(DepositEntry depositEntry, DepositBuilder depositBuilder) {
            super.apply(depositEntry, depositBuilder);
        }

        @Override
        protected DepositEntry createValueObject() {
            return new DepositEntry(accountNumber, accountAmount, accountsTitle, accountsSubTitle);

        }

        @Override
        protected DepositBuilder getThis() {
            return this;
        }

        @Override
        protected DepositBuilder newInstance() {
            return new DepositBuilder();
        }
    }

}
