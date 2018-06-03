package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.account.model.acount.*;

import static org.venuspj.util.objects2.Objects2.isNull;

public class Sale extends AbstractAccount<Sale> {

    private SaleCategory saleCategory;

    public Sale(AccountNumber number,
                AccountAmount accountAmount,
                AccountsTitle accountsTitle,
                AccountsSubTitle accountsSubTitle,
                Tax tax,
                TaxClassification taxClassification,
                SaleCategory saleCategory) {
        super(number, accountAmount, AccountsPart.REVENUE, accountsTitle, accountsSubTitle, tax, taxClassification);
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
        public SaleBuilder withAccountAmount(AccountAmount accountAmount) {
            return super.withAccountAmount(accountAmount);

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
            return new Sale(number, accountAmount, accountsTitle, accountsSubTitle, tax, taxClassification, saleCategory);

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
