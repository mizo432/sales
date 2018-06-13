package org.venuspj.sales.account.model.generalLedger;

import org.venuspj.sales.account.model.acountEntry.AccountEntries;

/**
 * 総勘定元帳
 */
public class GeneralLedger {
    GeneralLedgerAccount generalLedgerAccount;
    AccountEntries accountEntries = AccountEntries.create();
}
