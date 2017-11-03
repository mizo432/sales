package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDatetime;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.user.UserId;
import org.venuspj.sales.utils.Objects2;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

/**
 */
public class Event {
    RecordDatetime recordDatetime;
    UserId userId;

    Event() {
    }

    public Event(RecordDatetime aRecordDatetime, UserId anUserId) {
        recordDatetime = aRecordDatetime;
        userId = anUserId;
    }

    public RecordDatetime recordDatetime() {
        return recordDatetime;
    }

    public RecordYearMonth recordYearMonth() {
        return recordDatetime.recordYearMonth();

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("recordDatetime", recordDatetime)
                .add("userId", userId)
                .omitNullValues()
                .toString();
    }
}
