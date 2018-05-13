package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.util.Set;

import static org.venuspj.util.collect.Sets2.newHashSet;


public abstract class AccountingEvent {
    private EventType event;
    private RecordDateTimeValue whenOccurred;
    private RecordDateTimeValue whenNoticed;
    protected Set<AccountingEntry> resultingEntries = newHashSet();

    protected AccountingEvent(EventType event,
                              RecordDateTimeValue whenOccurred,
                              RecordDateTimeValue whenNoticed) {
        this.event = event;
        this.whenOccurred = whenOccurred;
        this.whenNoticed = whenNoticed;

    }

    public RecordDateTimeValue getWhenNoticed() {
        return whenNoticed;

    }

    public EventType getEventType() {
        return event;

    }

    public void addResultingEntry(AccountingEntry entry) {
        resultingEntries.add(entry);

    }

}
