package org.venuspj.sales.core.datasource.accountManagement.account.journal;

import org.springframework.stereotype.Repository;
import org.venuspj.sales.account.model.journal.JournalEntry;
import org.venuspj.sales.account.model.journal.JournalRepository;

@Repository
public class JournalDataSource implements JournalRepository {

    @Override
    public void store(JournalEntry entity) {

    }
}
