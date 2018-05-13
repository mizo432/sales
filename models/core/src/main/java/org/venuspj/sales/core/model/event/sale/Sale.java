package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.*;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class Sale extends AbstractAccount<Sale> {

    public Sale(AccountNumber number, Amount amount, AccountsSubTitle accountsSubTitle, Tax tax, TaxClassification taxClassification) {
        super(number, amount, AccountsPart.GENERAL_AND_ADMINISTRATIVE_EXPENSES, AccountsTitle.SALE, accountsSubTitle, tax, taxClassification);
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
