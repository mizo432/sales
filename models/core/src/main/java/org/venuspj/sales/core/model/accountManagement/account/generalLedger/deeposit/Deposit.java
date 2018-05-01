package org.venuspj.sales.core.model.accountManagement.account.generalLedger.deeposit;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.*;

public abstract class Deposit extends AbstractAccount {
    public Deposit(AccountNumber aNumber,
                   Amount anAmount,
                   AccountsTitle anAccountsTitle,
                   AccountsSubTitle anAccountsSubTitle) {
        super(aNumber, anAmount, AccountsPart.LIABILITIES, anAccountsTitle, anAccountsSubTitle, Tax.createEmpty(), TaxClassification.EXCLUDES);
    }
}
