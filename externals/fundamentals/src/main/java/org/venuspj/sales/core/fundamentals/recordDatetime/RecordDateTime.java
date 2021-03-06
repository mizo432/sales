package org.venuspj.sales.core.fundamentals.recordDatetime;

import com.google.common.collect.ComparisonChain;
import org.venuspj.sales.core.fundamentals.recordDate.DateValue;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import static org.venuspj.util.objects2.Objects2.*;

public class RecordDateTime implements Comparable<RecordDateTime>, DateValue {
    private LocalDateTime value;

    public RecordDateTime() {

    }

    RecordDateTime(LocalDateTime value) {
        this.value = value;

    }

    public static RecordDateTime of(LocalDateTime value) {
        return new RecordDateTime(value);
    }

    public String asText() {
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
    }

    public RecordYearMonth recordYearMonth() {
        if (!isPresent()) {
            return new RecordYearMonth();
        }
        int year = value.getYear();
        Month month = value.getMonth();
        return RecordYearMonth.of(YearMonth.of(year, month));
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    public LocalDateTime asLocalDateTime() {
        return value;

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof RecordDateTime &&
                sameValueAs((RecordDateTime) obj);
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    public boolean sameValueAs(RecordDateTime other) {
        return equal(value, other.value);

    }

    @Override
    public int compareTo(RecordDateTime o) {
        if (isNull(o)) return -1;

        if (this == o) return 0;

        return ComparisonChain
                .start()
                .compare(value, o.asLocalDateTime())
                .result();

    }

    @Override
    public RecordDateTimeValue atEndOfDay() {
        return null;
    }
}
