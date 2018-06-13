package org.venuspj.sales.account.model.generalLedger.advanceReceived;

import org.venuspj.sales.account.model.acount.*;

/**
 * 前受金（負債）
 */
public class AdvanceReceived extends AbstractAccount {

    public AdvanceReceived(AccountNumber accountNumber,
                           AccountAmount accountAmount,
                           AccountsTitle accountsTitle,
                           AccountsSubTitle accountsSubTitle) {

        super(accountNumber, accountAmount, AccountsPart.LIABILITIES, accountsTitle, accountsSubTitle, Tax.empty(), TaxClassification.EXCLUDES);
    }

}
