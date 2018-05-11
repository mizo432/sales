package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.*;
import org.venuspj.sales.core.model.accountManagement.account.Tax;

public class Sale extends AbstractAccount<Sale> {

    public Sale(AccountNumber aNumber, Amount anAmount, AccountsTitle anAccountsTitle, AccountsSubTitle anAccountsSubTitle, Tax aTax, TaxClassification aTaxClassification) {
        super(aNumber, anAmount, AccountsPart.SALES, anAccountsTitle, anAccountsSubTitle, aTax, aTaxClassification);
    }

    public static class SaleBuilder extends AbstractAccountBuilder<Sale, SaleBuilder> {

        @Override
        protected Sale createValueObject() {
            return new Sale(number, amount, accountsTitle, accountsSubTitle, tax, taxClassification);

        }

        @Override
        protected SaleBuilder getThis() {
            return this;

        }

        @Override
        protected SaleBuilder newInstance() {
            return new SaleBuilder();

        }
    }
}
