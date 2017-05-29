package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDatetime;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.user.UserId;

/**
 */
public class Event {
    RecordDatetime recordDatetime;
    UserId userId;

    Event() {
    }

    public Event(RecordDatetime aRecordDatetime, UserId userId) {
        recordDatetime = aRecordDatetime;
    }

    public RecordDatetime recordDatetime() {
        return recordDatetime;
    }

    public RecordYearMonth recordYearMonth() {
        return recordDatetime.recordYearMonth();

    }
}
