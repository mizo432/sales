package org.venuspj.sales.core.fundamentals.recordDatetime;


import org.junit.Test;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class RecordDateTimeTest {

    @Test
    public void asText() throws Exception {
        RecordDateTime target = RecordDateTime.of(LocalDateTime.of(2017, 4, 1, 2, 3, 4, 5));
        assertThat(target.asText())
                .isNotNull()
                .isEqualTo("2017/04/01 02:03:04.000");
    }

    @Test
    public void isPresent01() throws Exception {
        RecordDateTime target = new RecordDateTime();
        assertThat(target.isPresent())
                .isNotNull()
                .isFalse();
    }

    @Test
    public void isPresent02() throws Exception {
        RecordDateTime target = RecordDateTime.of(LocalDateTime.of(2017, 4, 1, 2, 3, 4, 5));
        assertThat(target.isPresent())
                .isNotNull()
                .isTrue();
    }

    @Test
    public void RecordYearMonth01() throws Exception {
        RecordDateTime target = RecordDateTime.of(LocalDateTime.of(2017, 4, 1, 2, 3, 4, 5));
        RecordYearMonth actual = target.recordYearMonth();
        assertThat(actual.isPresent())
                .isNotNull()
                .isTrue();
    }

    @Test
    public void RecordYearMonth02() throws Exception {
        RecordDateTime target = new RecordDateTime();
        RecordYearMonth actual = target.recordYearMonth();
        assertThat(actual.isPresent())
                .isNotNull()
                .isFalse();
    }

}