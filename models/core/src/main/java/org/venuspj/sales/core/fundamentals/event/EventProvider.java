package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.model.user.UserIdentifier;
import org.venuspj.sales.core.model.user.UserIdProvider;

/**
 */
public class EventProvider {

    public static Event newEvent() {
        UserIdentifier userIdentifier = UserIdProvider.currentUserId();
        WhenOccurred whenOccurred = new WhenOccurred(RecordDateTimeProvider.currentRecordDateTime());
        return new Event(whenOccurred, userIdentifier);

    }

}
