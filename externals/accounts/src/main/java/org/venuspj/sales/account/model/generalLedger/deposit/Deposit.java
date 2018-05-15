package org.venuspj.sales.account.model.generalLedger.deposit;

import org.venuspj.sales.account.model.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.account.model.TaxClassification;

public class Deposit extends AbstractAccount<Deposit> {
    public Deposit(AccountNumber number,
                   Amount amount,
                   AccountsTitle accountsTitle,
                   AccountsSubTitle accountsSubTitle) {
        super(number, amount, AccountsPart.LIABILITIES, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

    public static class DepositBuilder extends AbstractAccountBuilder<Deposit, DepositBuilder> {

        @Override
        protected void apply(Deposit deposit, DepositBuilder depositBuilder) {
            super.apply(deposit, depositBuilder);
        }

        @Override
        protected Deposit createValueObject() {
            return new Deposit(number, amount, accountsTitle, accountsSubTitle);
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
