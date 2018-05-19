package org.venuspj.sales.account.model.generalLedger;

import org.venuspj.sales.account.model.acountEntry.AccountEntries;

/**
 * 総勘定元帳
 */
public class GeneralLedger {
    private GeneralLedgerAccount generalLedgerAccount;
    private AccountEntries accountEntries = AccountEntries.create();

    public GeneralLedger(GeneralLedgerAccount generalLedgerAccount, AccountEntries accountEntries) {
        this.generalLedgerAccount = generalLedgerAccount;
        this.accountEntries = accountEntries;

    }

    public GeneralLedgerAccount getGeneralLedgerAccount() {
        return generalLedgerAccount;

    }

    public AccountEntries getAccountEntries() {
        return accountEntries;

    }
}
