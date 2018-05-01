package org.venuspj.sales.core.model.accountManagement.account.generalLedger.advanceReceived;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.*;

/**
 * 前受金（負債）
 */
public class AdvanceReceived extends AbstractAccount {

    public AdvanceReceived(AccountNumber aNumber,
                           Amount anAmount,
                           AccountsTitle anAccountsTitle,
                           AccountsSubTitle anAccountsSubTitle) {
        super(aNumber, anAmount, AccountsPart.LIABILITIES, anAccountsTitle, anAccountsSubTitle, Tax.createEmpty(), TaxClassification.EXCLUDES);
    }

}
