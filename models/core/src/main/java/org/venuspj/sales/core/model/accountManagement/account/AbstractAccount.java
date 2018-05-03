package org.venuspj.sales.core.model.accountManagement.account;

import com.google.common.base.MoreObjects;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.utils.Objects2;

/**
 */
public abstract class AbstractAccount implements Account {
    private final AccountNumber number;
    private final AccountsPart accountsPart;
    private final AccountsSubTitle accountsSubTitle;
    private final AccountsTitle accountsTitle;
    private final Amount amount;
    private final Tax tax;
    private final TaxClassification taxClassification;

    public AbstractAccount(AccountNumber aNumber,
                           Amount anAmount,
                           AccountsPart anAccountsPart,
                           AccountsTitle anAccountsTitle,
                           AccountsSubTitle anAccountsSubTitle,
                           Tax aTax,
                           TaxClassification aTaxClassification) {
        number = aNumber;
        amount = anAmount;
        accountsPart = anAccountsPart;
        accountsTitle = anAccountsTitle;
        accountsSubTitle = anAccountsSubTitle;
        tax = aTax;
        taxClassification = aTaxClassification;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("number", number)
                .add("accountsPart", accountsPart)
                .add("accountsTitle", accountsTitle)
                .add("accountsSubTitle", accountsSubTitle)
                .add("amount", amount)
                .add("tax", tax)
                .add("taxClassification", taxClassification)
                .omitNullValues()
                .toString();

    }

}
