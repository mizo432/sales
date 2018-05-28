package org.venuspj.sales.account.model.journal;

import org.venuspj.sales.account.model.acountEntry.AccountEntries;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

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

    private JournalEntryNumber getEntryNumber() {
        return entryNumber;
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
    public AccountEntries getDebits() {
        return debits;

    }

    public static class JournalEntryBuilder extends ObjectBuilder<JournalEntry, JournalEntryBuilder> {
        protected JournalEntryNumber entryNumber = new JournalEntryNumber();
        protected JournalEntryType entryType = JournalEntryType.UNKNOWN;
        protected Event event = new Event();
        protected AccountEntries credits = AccountEntries.create();
        protected AccountEntries debits = AccountEntries.create();

        @Override
        protected void apply(JournalEntry vo, JournalEntryBuilder builder) {
            builder.withEntryNumber(vo.getEntryNumber());

        }

        protected JournalEntryBuilder withEvent(Event event) {
            if (isNull(event)) return getThis();
            addConfigurator(builder -> builder.event = event);
            return getThis();
        }

        protected JournalEntryBuilder withEntryNumber(JournalEntryNumber entryNumber) {
            if (isNull(entryNumber)) return getThis();
            addConfigurator(builder -> builder.entryNumber = entryNumber);
            return getThis();
        }

        protected JournalEntryBuilder withEntryType(JournalEntryType entryType) {
            if (isNull(entryType)) return getThis();
            addConfigurator(builder -> builder.entryType = entryType);
            return getThis();
        }

        @Override
        protected JournalEntry createValueObject() {
            return new JournalEntry(entryNumber, event, credits, debits, entryType);
        }

        @Override
        protected JournalEntryBuilder getThis() {
            return this;
        }

        @Override
        protected JournalEntryBuilder newInstance() {
            return new JournalEntryBuilder();
        }
    }


}
