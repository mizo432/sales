package org.venuspj.sales.core.fundamentals.recordDatetime;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.externals.Objects2;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class RecordDatetime {
    private LocalDateTime value;

    RecordDatetime() {

    }

    public RecordDatetime(LocalDateTime aValue) {
        value = aValue;
    }

    public String asText() {
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
    }

    public RecordYearMonth recordYearMonth() {
        int year = value.getYear();
        Month month = value.getMonth();
        return new RecordYearMonth(YearMonth.of(year, month));
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }
}
