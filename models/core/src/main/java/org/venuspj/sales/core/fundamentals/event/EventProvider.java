package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.model.user.UserId;
import org.venuspj.sales.core.model.user.UserIdProvider;

/**
 */
public class EventProvider {

    public static Event newEvent() {
        UserId userId = UserIdProvider.currentUserId();
        RecordDateTime recordDatetime = RecordDateTimeProvider.currentRecordDateTime();
        return new Event(recordDatetime, userId);

    }

}
