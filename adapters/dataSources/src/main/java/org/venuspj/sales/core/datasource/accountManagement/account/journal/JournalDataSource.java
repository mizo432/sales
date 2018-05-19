package org.venuspj.sales.core.datasource.accountManagement.account.journal;

import org.springframework.stereotype.Repository;
import org.venuspj.sales.core.model.accountManagement.account.journal.JournalEntry;
import org.venuspj.sales.core.model.accountManagement.account.journal.JournalRepository;

@Repository
public class JournalDataSource implements JournalRepository {

    @Override
    public void store(JournalEntry entity) {

    }
}
