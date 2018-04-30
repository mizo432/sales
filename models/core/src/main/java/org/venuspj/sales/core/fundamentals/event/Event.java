package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.user.UserId;

/**
 */
public class Event {
    private final WhenOccurred whenOccurred;
    private final UserId userId;

    Event() {
        this.whenOccurred = new WhenOccurred();
        this.userId = new UserId();

    }

    public Event(WhenOccurred whenOccurred, UserId userId) {
        this.whenOccurred = whenOccurred;
        this.userId = userId;
    }

    public Event(RecordDateTime whenOccurred, UserId userId) {
        this.whenOccurred = new WhenOccurred(whenOccurred);
        this.userId = userId;
    }

    public WhenOccurred whenOccurred() {
        return whenOccurred;

    }

    public RecordYearMonth whenOccurredYearMonth() {
        return whenOccurred.asRecordDateTime().recordYearMonth();
    }
}
