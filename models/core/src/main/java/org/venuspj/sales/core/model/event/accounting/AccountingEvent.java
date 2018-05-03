package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.util.Set;

import static org.venuspj.sales.utils.collect.Sets2.newHashSet;


public abstract class AccountingEvent {
    private AccountingEvent event;
    private RecordDateTimeValue whenOccurred;
    private RecordDateTimeValue whenNoticed;
    private Set<AccountingEntry> resultingEntries = newHashSet();

    protected AccountingEvent(AccountingEvent event,
                              RecordDateTimeValue whenOccurred,
                              RecordDateTimeValue whenNoticed) {
        this.event = event;
        this.whenOccurred = whenOccurred;
        this.whenNoticed = whenNoticed;

    }

    public RecordDateTimeValue getWhenNoticed() {
        return whenNoticed;

    }

    public void addResultingEntry(AccountingEntry entry) {
        resultingEntries.add(entry);

    }

}
