package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.account.model.acountEntry.AccountEntry;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

/**
 * 勘定の基底クラス
 */
public abstract class AbstractAccount<T> implements AccountEntry {
    private AccountNumber number = new AccountNumber();
    private AccountsPart accountsPart = AccountsPart.UNKNOWN;
    private AccountsSubTitle accountsSubTitle = new AccountsSubTitle();
    private AccountsTitle accountsTitle = AccountsTitle.UNKNOWN;
    private Amount amount = Amount.yenZero();
    private Tax tax = Tax.empty();
    private TaxClassification taxClassification = TaxClassification.UNKNOWN;

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

    @Override
    public boolean isCredit() {
        return DebitOrCredit.CREDIT == whichDebitOrCredit();

    }

    @Override
    public boolean isDebit() {
        return DebitOrCredit.DEBIT == whichDebitOrCredit();

    }

    DebitOrCredit whichDebitOrCredit() {
        return getAccountsPart().whichDebitOrCredit(amount);

    }

    protected AbstractAccount() {

    }

    protected AbstractAccount(AccountNumber number,
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
        protected AccountNumber number = new AccountNumber();
        protected AccountsPart accountsPart = AccountsPart.UNKNOWN;
        protected AccountsSubTitle accountsSubTitle = new AccountsSubTitle();
        protected AccountsTitle accountsTitle = AccountsTitle.UNKNOWN;
        protected Amount amount = Amount.yenZero();
        protected Tax tax = Tax.empty();
        protected TaxClassification taxClassification = TaxClassification.UNKNOWN;

        @Override
        protected void apply(T vo, B builder) {
            builder.withNumber(vo.getNumber());
            builder.withAccountsPart(vo.getAccountsPart());
            builder.withAccountsSubTitle(vo.getAccountsSubTitle());
            builder.withAccountsTitle(vo.getAccountsTitle());
            builder.withAmount(vo.getAmount());
            builder.withTax(vo.getTax());
            builder.withTaxClassification(vo.getTaxClassification());
        }

        protected B withTaxClassification(TaxClassification taxClassification) {
            if (isNull(taxClassification)) return getThis();
            addConfigurator(b -> b.taxClassification = taxClassification);
            return getThis();
        }

        protected B withTax(Tax tax) {
            if (isNull(tax)) return getThis();
            addConfigurator(b -> b.tax = tax);
            return getThis();
        }

        protected B withAmount(Amount amount) {
            if (isNull(amount)) return getThis();
            addConfigurator(b -> b.amount = amount);
            return getThis();
        }


        protected B withAccountsTitle(AccountsTitle accountsTitle) {
            if (isNull(accountsTitle)) return getThis();
            addConfigurator(b -> b.accountsTitle = accountsTitle);
            return getThis();
        }

        protected B withAccountsSubTitle(AccountsSubTitle accountsSubTitle) {
            if (isNull(accountsSubTitle)) return getThis();
            addConfigurator(b -> b.accountsSubTitle = accountsSubTitle);
            return getThis();
        }

        protected B withAccountsPart(AccountsPart accountsPart) {
            if (isNull(accountsPart)) return getThis();
            addConfigurator(b -> b.accountsPart = accountsPart);
            return getThis();

        }

        protected B withNumber(AccountNumber number) {
            if (isNull(number)) return getThis();
            addConfigurator(b -> b.number = number);
            return getThis();
        }

    }


}
