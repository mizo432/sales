package org.venuspj.sales.core.model.accountManagement.account.generalLedger;

import org.venuspj.sales.core.model.accountManagement.account.acountEntry.AccountEntries;

/**
 * 総勘定元帳
 */
public class GeneralLedger {
    GeneralLedgerAccount generalLedgerAccount;
    AccountEntries accountEntries = AccountEntries.create();
}
