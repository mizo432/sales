package org.venuspj.sales.core.fundamentals.recordDatetime;

import com.google.common.collect.ComparisonChain;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import static org.venuspj.util.objects2.Objects2.isNull;
import static org.venuspj.util.objects2.Objects2.nonNull;

public class RecordDateTime implements Comparable<RecordDateTime> {
    private LocalDateTime value;

    public RecordDateTime() {

    }

    public RecordDateTime(LocalDateTime aValue) {
        value = aValue;
    }

    public String asText() {
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
    }

    public RecordYearMonth recordYearMonth() {
        if (!isPresent()) {
            return new RecordYearMonth(null);
        }
        int year = value.getYear();
        Month month = value.getMonth();
        return new RecordYearMonth(YearMonth.of(year, month));
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    public LocalDateTime asLocalDateTime() {
        return value;

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
}
