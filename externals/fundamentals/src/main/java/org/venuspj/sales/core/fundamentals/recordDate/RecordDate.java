package org.venuspj.sales.core.fundamentals.recordDate;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

import java.time.LocalDate;
import java.time.YearMonth;

import static org.venuspj.util.objects2.Objects2.*;

public class RecordDate {
    private LocalDate value = null;

    public RecordDate() {
    }

    RecordDate(LocalDate value) {
        this.value = value;
    }

    public static RecordDate of(LocalDate value) {
        return new RecordDate(value);
    }

    public int compareTo(RecordDate other) {
        return value.compareTo(other.value);

    }

    public boolean isAfter(RecordDate other) {
        return value.isAfter(other.value);

    }

    public boolean isBefore(RecordDate other) {
        return value.isBefore(other.value);

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RecordDate))
            return false;
        RecordDate that = (RecordDate) obj;
        return equal(value, that.value);

    }

    @Override
    public int hashCode() {
        return hash(value);

    }

    public RecordYearMonth getRecordYearMonth() {
        if (isNull(value)) return new RecordYearMonth();

        return RecordYearMonth.of(YearMonth.of(value.getYear(), value.getMonth()));

    }

    public LocalDate asDate() {
        return value;
    }
}
