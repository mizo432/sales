package org.venuspj.sales.core.model.accountManagement.account.generalLedger.deposit;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.*;

public abstract class Deposit extends AbstractAccount {
    public Deposit(AccountNumber number,
                   Amount amount,
                   AccountsTitle accountsTitle,
                   AccountsSubTitle accountsSubTitle) {
        super(number, amount, AccountsPart.LIABILITIES, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

}
