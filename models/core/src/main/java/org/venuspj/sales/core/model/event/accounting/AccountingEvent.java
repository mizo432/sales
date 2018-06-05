package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.account.fundamentals.whenNoticed.WhenNoticed;
import org.venuspj.sales.core.fundamentals.whenOccurred.WhenOccurred;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.util.Set;

import static org.venuspj.util.collect.Sets2.newHashSet;


public abstract class AccountingEvent {
    private EventType event;
    private WhenOccurred whenOccurred;
    private WhenNoticed whenNoticed;
    protected Set<AbstractAccountingEntry> resultingEntries = newHashSet();

    protected AccountingEvent(EventType event,
                              RecordDateTimeValue whenOccurred,
                              RecordDateTimeValue whenNoticed) {
        this.event = event;
        this.whenOccurred = WhenOccurred.of(whenNoticed);
        this.whenNoticed = WhenNoticed.of(whenNoticed);

    }

    public WhenNoticed getWhenNoticed() {
        return whenNoticed;

    }

    public WhenOccurred getWhenOccurred() {
        return whenOccurred;

    }

    public EventType getEventType() {
        return event;

    }

    public void addResultingEntry(AbstractAccountingEntry entry) {
        resultingEntries.add(entry);

    }

}
