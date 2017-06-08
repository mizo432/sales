package org.venuspj.sales.core.fundamentals.recordDate;

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
}
