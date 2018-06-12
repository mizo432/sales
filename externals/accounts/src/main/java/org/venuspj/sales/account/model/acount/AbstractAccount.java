package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.account.model.acountEntry.AccountEntry;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

/**
 * 勘定の基底クラス
 */
public abstract class AbstractAccount<T> implements AccountEntry {
    private AccountNumber accountNumber = new AccountNumber();
    private AccountsPart accountsPart = AccountsPart.UNKNOWN;
    private AccountsSubTitle accountsSubTitle = new AccountsSubTitle();
    private AccountsTitle accountsTitle = AccountsTitle.UNKNOWN;
    private AccountAmount accountAmount = AccountAmount.yenZero();
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

    public AccountAmount getAccountAmount() {
        return accountAmount;
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
        return getAccountsPart().whichDebitOrCredit(accountAmount);

    }

    protected AbstractAccount() {

    }

    protected AbstractAccount(AccountNumber accountNumber,
                              AccountAmount accountAmount,
                              AccountsPart accountsPart,
                              AccountsTitle accountsTitle,
                              AccountsSubTitle accountsSubTitle,
                              Tax tax,
                              TaxClassification taxClassification) {
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
        this.accountsPart = accountsPart;
        this.accountsTitle = accountsTitle;
        this.accountsSubTitle = accountsSubTitle;
        this.tax = tax;
        this.taxClassification = taxClassification;

    }

    protected AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public AccountAmount getSubTotal() {
        if (taxClassification.isOuterTax()) return AccountAmount.yen(accountAmount.asLong() + tax.asLong());
        return AccountAmount.yen(accountAmount.asLong());
    }

    public static abstract class AbstractAccountBuilder<T extends AbstractAccount<T>, B extends AbstractAccountBuilder<T, B>> extends ObjectBuilder<T, B> {
        protected AccountNumber accountNumber = new AccountNumber();
        protected AccountsSubTitle accountsSubTitle = new AccountsSubTitle();
        protected AccountsTitle accountsTitle = AccountsTitle.UNKNOWN;
        protected AccountAmount accountAmount = AccountAmount.yenZero();
        protected Tax tax = Tax.empty();
        protected TaxClassification taxClassification = TaxClassification.UNKNOWN;

        @Override
        protected void apply(T vo, B builder) {
            builder.withAccountNumber(vo.getAccountNumber());
            builder.withAccountsSubTitle(vo.getAccountsSubTitle());
            builder.withAccountsTitle(vo.getAccountsTitle());
            builder.withAccountAmount(vo.getAccountAmount());
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

        protected B withAccountAmount(AccountAmount accountAmount) {
            if (isNull(accountAmount)) return getThis();
            addConfigurator(b -> b.accountAmount = accountAmount);
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

        protected B withAccountNumber(AccountNumber accountNumber) {
            if (isNull(accountNumber)) return getThis();
            addConfigurator(b -> b.accountNumber = accountNumber);
            return getThis();
        }

    }


}
