package org.venuspj.sales.core.fundamentals.recordDate;

import org.junit.Test;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDate;
import java.time.YearMonth;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RecordDateTest {

    @Test
    public void of() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        LocalDate actual = target.asDate();
        assertThat(actual).isEqualTo(LocalDate.of(2018, 8, 1));

    }


    @Test
    public void isAfter1() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        boolean actual = target.isAfter(RecordDate.of(LocalDate.of(2018, 8, 1)));
        assertThat(actual).isFalse();
    }

    @Test
    public void isAfter2() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        boolean actual = target.isAfter(RecordDate.of(LocalDate.of(2018, 8, 2)));
        assertThat(actual).isFalse();
    }

    @Test
    public void isAfter3() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        boolean actual = target.isAfter(RecordDate.of(LocalDate.of(2018, 7, 31)));
        assertThat(actual).isTrue();
    }

    @Test
    public void isBefore1() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        boolean actual = target.isBefore(RecordDate.of(LocalDate.of(2018, 8, 1)));
        assertThat(actual).isFalse();
    }

    @Test
    public void isBefore2() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        boolean actual = target.isBefore(RecordDate.of(LocalDate.of(2018, 8, 2)));
        assertThat(actual).isTrue();
    }

    @Test
    public void isBefore3() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));
        boolean actual = target.isBefore(RecordDate.of(LocalDate.of(2018, 7, 31)));
        assertThat(actual).isFalse();
    }

    @Test
    public void equal1() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));

        boolean actual = target.equals(RecordDate.of(LocalDate.of(2018, 8, 1)));
        assertThat(actual).isTrue();
    }

    @Test
    public void equal2() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));

        boolean actual = target.equals(RecordDate.of(LocalDate.of(2018, 8, 2)));
        assertThat(actual).isFalse();
    }

    @Test
    public void equal3() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));

        boolean actual = target.equals(1);
        assertThat(actual).isFalse();
    }

    @Test
    public void equal4() {
        RecordDate target = RecordDate.of(LocalDate.of(2018, 8, 1));

        boolean actual = target.equals(1);
        assertThat(actual).isFalse();
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
        assertThat(actual).isEqualTo(RecordYearMonth.of(YearMonth.of(2018, 8)));
    }
}