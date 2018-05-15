package org.venuspj.sales.account.model;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

/**
 * 勘定の基底クラス
 */
public abstract class AbstractAccount<T> implements Account {
    private AccountNumber number;
    private AccountsPart accountsPart;
    private AccountsSubTitle accountsSubTitle;
    private AccountsTitle accountsTitle;
    private Amount amount;
    private Tax tax;
    private TaxClassification taxClassification;

    public AccountsPart getAccountsPart() {
        return accountsPart;
    }

    public AccountsSubTitle getAccountsSubTitle() {
        return accountsSubTitle;
    }

    public AccountsTitle getAccountsTitle() {
        return accountsTitle;
    }

    public Amount getAmount() {
        return amount;
    }

    public Tax getTax() {
        return tax;
    }

    public TaxClassification getTaxClassification() {
        return taxClassification;
    }


    public AbstractAccount(AccountNumber number,
                           Amount amount,
                           AccountsPart accountsPart,
                           AccountsTitle accountsTitle,
                           AccountsSubTitle accountsSubTitle,
                           Tax tax,
                           TaxClassification taxClassification) {
        this.number = number;
        this.amount = amount;
        this.accountsPart = accountsPart;
        this.accountsTitle = accountsTitle;
        this.accountsSubTitle = accountsSubTitle;
        this.tax = tax;
        this.taxClassification = taxClassification;

    }

    protected AccountNumber getNumber() {
        return number;
    }

    public Amount getSubTotal() {
        if (taxClassification.isOuterTax()) return Amount.yen(amount.asInteger() + tax.asInteger());
        return Amount.yen(amount.asInteger());
    }

    public static abstract class AbstractAccountBuilder<T extends AbstractAccount<T>, B extends AbstractAccountBuilder<T, B>> extends ObjectBuilder<T, B> {
        protected AccountNumber number;
        protected AccountsPart accountsPart;
        protected AccountsSubTitle accountsSubTitle;
        protected AccountsTitle accountsTitle;
        protected Amount amount;
        protected Tax tax;
        protected TaxClassification taxClassification;

        @Override
        protected void apply(T vo, B builder) {
            builder.withNumber(vo.getNumber());
            builder.withAccountsPart(vo.getAccountsPart());
            builder.withAccountsSubTitle(vo.getAccountsSubTitle());
            builder.withAccountsTitle(vo.getAccountsTitle());
            builder.withAmount(vo.getAmount());
            builder.witTax(vo.getTax());
            builder.witTaxClassification(vo.getTaxClassification());
        }

        public B witTaxClassification(TaxClassification taxClassification) {
            if (isNull(taxClassification)) return getThis();
            addConfigurator(b -> b.taxClassification = taxClassification);
            return getThis();
        }

        public B witTax(Tax tax) {
            if (isNull(tax)) return getThis();
            addConfigurator(b -> b.tax = tax);
            return getThis();
        }

        public B withAmount(Amount amount) {
            if (isNull(amount)) return getThis();
            addConfigurator(b -> b.amount = amount);
            return getThis();
        }


        public B withAccountsTitle(AccountsTitle accountsTitle) {
            if (isNull(accountsTitle)) return getThis();
            addConfigurator(b -> b.accountsTitle = accountsTitle);
            return getThis();
        }

        public B withAccountsSubTitle(AccountsSubTitle accountsSubTitle) {
            if (isNull(accountsSubTitle)) return getThis();
            addConfigurator(b -> b.accountsSubTitle = accountsSubTitle);
            return getThis();
        }

        public B withAccountsPart(AccountsPart accountsPart) {
            if (isNull(accountsPart)) return getThis();
            addConfigurator(b -> b.accountsPart = accountsPart);
            return getThis();

        }


        public B withNumber(AccountNumber number) {
            if (isNull(number)) return getThis();
            addConfigurator(b -> b.number = number);
            return getThis();
        }

    }


}
