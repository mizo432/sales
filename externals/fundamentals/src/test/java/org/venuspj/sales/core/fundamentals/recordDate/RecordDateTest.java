package org.venuspj.sales.core.fundamentals.recordDate;

import org.junit.Test;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDate;
import java.time.YearMonth;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RecordDateTest {

    @Test
    public void of() {
    }

    @Test
    public void compareTo() {
    }

    @Test
    public void isAfter() {
    }

    @Test
    public void isBefore() {
    }

    @Test
    public void equals() {
    }

    @Test
    public void hash() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        int actual = target.hashCode();
        assertThat(actual).isEqualTo(4133408);
    }

    @Test
    public void getRecordYearMonth() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        RecordYearMonth actual = target.getRecordYearMonth();
        assertThat(actual).isEqualTo(RecordYearMonth.of(YearMonth.of(2018,8)));
    }
}