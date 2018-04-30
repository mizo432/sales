package org.venuspj.sales.core.fundamentals.recordDatetime;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class RecordDateTimeProviderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RecordDateTimeProviderTest.class);

    @Test
    public void currentRecordDateTime() {
        StaticRecordDateTimeProvider.initialize(LocalDateTime.of(2017, 1, 12, 3, 4, 5, 6));
        RecordDateTime actual = RecordDateTimeProvider.currentRecordDateTime();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
        assertThat(actual.toString())
                .isNotNull()
                .isEqualTo("RecordDateTime{2017-01-12T03:04:05.000000006}");
    }

    @Test
    public void defaultCurrentRecordDateTime() {
        RecordDateTime actual = RecordDateTimeProvider.currentRecordDateTime();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }

}