package org.venuspj.sales.core.fundamentals.recordDatetime;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class RecordDatetime {
    private LocalDateTime value;

    RecordDatetime() {

    }

    RecordDatetime(LocalDateTime aValue) {
        value = aValue;
    }

    public String asText() {
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
    }

    public RecordYearMonth recordYearMonth() {
        int year = value.getYear();
        Month month = value.getMonth();
        return new RecordYearMonth(YearMonth.of(year,month));
    }
}
