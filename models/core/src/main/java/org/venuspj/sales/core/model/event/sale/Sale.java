package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;

public class Sale extends AbstractAccount<Sale> {

    public Sale(AccountNumber number, Amount amount, AccountsSubTitle accountsSubTitle, Tax tax, TaxClassification taxClassification) {
        super(number, amount, AccountsPart.REVENUE, AccountsTitle.SALE, accountsSubTitle, tax, taxClassification);

    }

    public static class SaleBuilder extends AbstractAccountBuilder<Sale, SaleBuilder> {

        @Override
        protected Sale createValueObject() {
            return new Sale(number, amount, accountsSubTitle, tax, taxClassification);

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
