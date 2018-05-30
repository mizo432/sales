package org.venuspj.sales.account.model.generalLedger.deposit;

import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;

/**
 * 預り金勘定科目
 */
public class DepositEntry extends AbstractAccount<DepositEntry> {

    public DepositEntry(AccountNumber number,
                        Amount amount,
                        AccountsTitle accountsTitle,
                        AccountsSubTitle accountsSubTitle) {
        super(number, amount, AccountsPart.LIABILITIES, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);

    }


    public static class DepositBuilder extends AbstractAccountBuilder<DepositEntry, DepositBuilder> {
        @Override
        public DepositBuilder withNumber(AccountNumber accountNumber) {
            return super.withNumber(number);
        }

        @Override
        public DepositBuilder withAmount(Amount amount) {
            return super.withAmount(amount);
        }

        @Override
        protected void apply(DepositEntry depositEntry, DepositBuilder depositBuilder) {
            super.apply(depositEntry, depositBuilder);
        }

        @Override
        protected DepositEntry createValueObject() {
            return new DepositEntry(number, amount, accountsTitle, accountsSubTitle);

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
