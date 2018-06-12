package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.model.sale.SaleIdentifier;

import static org.venuspj.util.objects2.Objects2.isNull;

public class Sale extends AbstractAccount<Sale> {

    SaleIdentifier saleIdentifier = new SaleIdentifier();

    public Sale(SaleIdentifier saleIdentifier, AccountNumber accountNumber, AccountAmount accountAmount, AccountsSubTitle accountsSubTitle, Tax tax, TaxClassification taxClassification) {
        super(accountNumber, accountAmount, AccountsPart.REVENUE, AccountsTitle.SALE, accountsSubTitle, tax, taxClassification);


    }

    public SaleIdentifier getSaleIdentifier() {
        return saleIdentifier;
    }

    public static class SaleBuilder extends AbstractAccountBuilder<Sale, SaleBuilder> {
        SaleIdentifier saleIdentifier = new SaleIdentifier();

        @Override
        protected void apply(Sale vo, SaleBuilder builder) {
            super.apply(vo, builder);
            builder.withSaleIdentifier(vo.getSaleIdentifier());
        }

        private SaleBuilder withSaleIdentifier(SaleIdentifier saleIdentifier) {
            if (isNull(saleIdentifier)) return getThis();
            addConfigurator(builder -> builder.saleIdentifier = saleIdentifier);
            return getThis();

        }

        @Override
        protected Sale createValueObject() {
            return new Sale(saleIdentifier, accountNumber, accountAmount, accountsSubTitle, tax, taxClassification);

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
