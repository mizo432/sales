package org.venuspj.sales.core.model.accountManagement.account.journal;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.accountManagement.account.acountEntry.AccountEntries;

public class JournalEntry {

    private final JournalEntryNumber entryNumber;
    private final JournalEntryType entryType;
    private final Event event;
    private final AccountEntries credits;
    private final AccountEntries debits;

    public JournalEntry() {
        entryType = JournalEntryType.UNKNOWN;
        event = EventProvider.newEvent();
        credits = AccountEntries.create();
        debits = AccountEntries.create();
        entryNumber = JournalEntryNumber.empty();

    }

    private JournalEntry(JournalEntryNumber entryNumber, Event event, AccountEntries credits, AccountEntries debits, JournalEntryType entryType) {
        this.entryType = entryType;
        this.entryNumber = entryNumber;
        this.event = event;
        this.credits = credits;
        this.debits = debits;

    }

    /**
     * 借方
     *
     * @return
     */
    public AccountEntries getCedits() {
        return credits;

    }

    /**
     * 貸方
     *
     * @return
     */
    public AccountEntries getDebit() {
        return debits;

    }

}
