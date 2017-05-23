package org.venuspj.sales.core.usecase.impl.importingBankAccountLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.sales.core.model.bankBook.log.BankAccountLog;
import org.venuspj.sales.core.model.bankBook.log.BankAccountLogRepository;
import org.venuspj.sales.core.usecase.reconciliatingManagement.importingBankAccountLog.ImportingBankAccountLog;

/**
 */
@Service
public class ImportingBankAccountLogImpl implements ImportingBankAccountLog {
    private BankAccountLogRepository bankAccountLogRepository;

    @Autowired
    public ImportingBankAccountLogImpl(BankAccountLogRepository aBankAccountLogRepository){

    }

    @Override
    public void doIt(BankAccountLog aBankAccountLog) {
        bankAccountLogRepository.save(aBankAccountLog);

    }
}
