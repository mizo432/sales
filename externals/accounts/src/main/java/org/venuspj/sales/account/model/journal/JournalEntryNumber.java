package org.venuspj.sales.account.model.journal;

public class JournalEntryNumber implements EntityIdentifier<JournalEntry> {
    final Long value;

    public JournalEntryNumber() {
        value = null;
    }

    JournalEntryNumber(Long value) {

        this.value = value;
    }

    public static JournalEntryNumber empty() {
        return new JournalEntryNumber();

    }

    public static JournalEntryNumber of(Long value) {
        return new JournalEntryNumber(value);

    }
}
