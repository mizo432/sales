package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDatetime;
import org.venuspj.sales.core.model.user.UserId;
import org.venuspj.sales.core.model.user.UserIdProvider;

/**
 * Created by mizoguchi on 2017/05/28.
 */
public class EventProvider {

    public static Event newEvent() {
        UserId userId = UserIdProvider.currentUserId();
        RecordDatetime recordDatetime = RecordDateTimeProvider.currentRecordDateTime();
        return new Event(recordDatetime, userId);

    }

}
