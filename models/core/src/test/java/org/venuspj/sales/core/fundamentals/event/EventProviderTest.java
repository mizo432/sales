package org.venuspj.sales.core.fundamentals.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.sales.core.fundamentals.recordDatetime.StaticRecordDateTimeProvider;

import java.time.LocalDateTime;

/**
 */
public class EventProviderTest {
    private static Logger LOGGER = LoggerFactory.getLogger(EventProviderTest.class);

    @Test
    public void newEvent() {
        StaticRecordDateTimeProvider.initialize(LocalDateTime.now());
        Event actual = EventProvider.newEvent();
        LOGGER.debug("actual:" + actual.toString());
    }

}