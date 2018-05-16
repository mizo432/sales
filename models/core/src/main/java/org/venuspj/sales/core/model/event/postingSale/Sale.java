package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.account.model.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.account.model.TaxClassification;

import static org.venuspj.util.objects2.Objects2.isNull;

public class Sale extends AbstractAccount<Sale> {

    private SaleCategory saleCategory;

    public Sale(AccountNumber number,
                Amount amount,
                AccountsTitle accountsTitle,
                AccountsSubTitle accountsSubTitle,
                Tax tax,
                TaxClassification taxClassification,
                SaleCategory saleCategory) {
        super(number, amount, AccountsPart.SALES, accountsTitle, accountsSubTitle, tax, taxClassification);
        this.saleCategory = saleCategory;
    }

    private SaleCategory getSaleCategory() {
        return saleCategory;
    }


    public static class SaleBuilder extends AbstractAccountBuilder<Sale, SaleBuilder> {

        private SaleCategory saleCategory;

        @Override
        protected void apply(Sale vo, SaleBuilder builder) {
            super.apply(vo, builder);
            builder.withSaleCategory(vo.getSaleCategory());
        }

        private SaleBuilder withSaleCategory(SaleCategory saleCategory) {
            if (isNull(saleCategory)) return getThis();

            addConfigurator(builder -> builder.saleCategory = saleCategory);

            return getThis();
        }

        @Override
        protected Sale createValueObject() {
            return new Sale(number, amount, accountsTitle, accountsSubTitle, tax, taxClassification, saleCategory);

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
