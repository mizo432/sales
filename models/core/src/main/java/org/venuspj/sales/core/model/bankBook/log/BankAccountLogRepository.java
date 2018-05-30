package org.venuspj.sales.core.model.bankBook.log;

/**
 */
public interface BankAccountLogRepository {
    void save(BankAccountEntry aBankAccountEntry);
}
