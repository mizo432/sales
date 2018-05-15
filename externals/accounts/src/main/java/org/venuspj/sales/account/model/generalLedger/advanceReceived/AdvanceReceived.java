package org.venuspj.sales.account.model.generalLedger.advanceReceived;

import org.venuspj.sales.account.model.*;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.account.model.TaxClassification;

/**
 * 前受金（負債）
 */
public class AdvanceReceived extends AbstractAccount {

    public AdvanceReceived(AccountNumber aNumber,
                           Amount anAmount,
                           AccountsTitle anAccountsTitle,
                           AccountsSubTitle anAccountsSubTitle) {
        super(aNumber, anAmount, AccountsPart.LIABILITIES, anAccountsTitle, anAccountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

}
