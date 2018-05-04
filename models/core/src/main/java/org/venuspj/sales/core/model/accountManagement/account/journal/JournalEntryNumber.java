package org.venuspj.sales.core.model.accountManagement.account.journal;

public class JournalEntryNumber implements EntityIdentifire<JournalEntry> {
    final Long value;

    JournalEntryNumber() {
        value = null;
    }

    JournalEntryNumber(Long value) {

        this.value = value;
    }

    public static JournalEntryNumber empty() {
        return new JournalEntryNumber();
    }
}
