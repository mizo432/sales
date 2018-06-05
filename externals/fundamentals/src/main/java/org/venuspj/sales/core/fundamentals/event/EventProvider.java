package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.fundamentals.whenOccurred.WhenOccurred;
import org.venuspj.sales.core.model.user.UserIdProvider;
import org.venuspj.sales.core.model.user.UserIdentifier;

/**
 */
public class EventProvider {

    public static Event newEvent() {
        UserIdentifier userIdentifier = UserIdProvider.currentUserId();
        WhenOccurred whenOccurred = WhenOccurred.of(RecordDateTimeProvider.currentRecordDateTime());
        return new Event(whenOccurred, userIdentifier);

    }

}
