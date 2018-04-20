package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.core.fundamentals.recordDatetime.DateTimeValue;

import java.util.Set;

import static org.venuspj.sales.utils.collect.Sets2.newHashSet;


public abstract class AccountingEvent {
    private AccountingEvent event;
    private DateTimeValue whenOccurred;
    private DateTimeValue whenNoticed;
    private Set<AccountingEntry> resultingEntries = newHashSet();

    protected AccountingEvent(AccountingEvent event,
                              DateTimeValue whenOccurred,
                              DateTimeValue whenNoticed) {
        this.event = event;
        this.whenOccurred = whenOccurred;
        this.whenNoticed = whenNoticed;

    }

    public DateTimeValue getWhenNoticed() {
        return whenNoticed;

    }

    public void addResultingEntry(AccountingEntry entry) {
        resultingEntries.add(entry);

    }

}
