package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;

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

}
