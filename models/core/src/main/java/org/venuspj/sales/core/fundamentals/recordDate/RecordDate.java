package org.venuspj.sales.core.fundamentals.recordDate;

import org.venuspj.sales.utils.Objects2;

import java.time.LocalDate;

public class RecordDate {
    LocalDate value = null;

    RecordDate() {
    }

    public RecordDate(LocalDate aValue) {
        value = aValue;
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
        return Objects2.equal(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }
}
