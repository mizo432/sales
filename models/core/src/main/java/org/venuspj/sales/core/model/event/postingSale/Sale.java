package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;

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
        super(number, amount, AccountsPart.REVENUE, accountsTitle, accountsSubTitle, tax, taxClassification);
        this.saleCategory = saleCategory;
    }

    private SaleCategory getSaleCategory() {
        return saleCategory;
    }


    public static class SaleBuilder extends AbstractAccountBuilder<Sale, SaleBuilder> {

        private SaleCategory saleCategory;


        @Override
        public SaleBuilder withTax(Tax tax) {
            return super.withTax(tax);
        }

        @Override
        public SaleBuilder withTaxClassification(TaxClassification taxClassification) {
            return super.withTaxClassification(taxClassification);

        }

        @Override
        public SaleBuilder withAccountsSubTitle(AccountsSubTitle accountsSubTitle) {
            return super.withAccountsSubTitle(accountsSubTitle);

        }

        @Override
        public SaleBuilder withAccountsTitle(AccountsTitle accountsTitle) {
            return super.withAccountsTitle(accountsTitle);

        }

        @Override
        public SaleBuilder withNumber(AccountNumber accountNumber) {
            return super.withNumber(number);

        }

        @Override
        public SaleBuilder withAmount(Amount amount) {
            return super.withAmount(amount);

        }

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
