package org.venuspj.sales.core.usecase.reconciliatingManagement.importingBankAccountLog;

import org.venuspj.sales.core.model.bankBook.log.BankAccountLog;

/**
 *
 */
public interface ImportingBankAccountLog {
    void doIt(BankAccountLog aBankAccountLog);
}