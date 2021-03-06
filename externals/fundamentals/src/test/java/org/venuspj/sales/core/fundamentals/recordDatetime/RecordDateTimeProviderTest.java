package org.venuspj.sales.core.fundamentals.recordDatetime;

import org.junit.Test;
import org.slf4j.Logger;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class RecordDateTimeProviderTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void currentRecordDateTime() {
        StaticRecordDateTimeProvider.initialize(LocalDateTime.of(2017, 1, 12, 3, 4, 5, 6));
        RecordDateTime actual = RecordDateTimeProvider.currentRecordDateTime();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
        assertThat(toStringHelper(actual).addValue(actual.asText()).omitNullValues().toString())
                .isNotNull()
                .isEqualTo("RecordDateTime{\"2017/01/12 03:04:05.000\"}");
    }

    @Test
    public void defaultCurrentRecordDateTime() {
        RecordDateTime actual = RecordDateTimeProvider.currentRecordDateTime();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }

}