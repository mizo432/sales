package org.venuspj.sales.core.fundamentals.recordYearMonth;

import java.time.YearMonth;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class RecordYearMonth {
    private YearMonth value;

    public RecordYearMonth() {

    }

    RecordYearMonth(YearMonth value) {
        this.value = value;

    }

    public static RecordYearMonth empty() {
        return new RecordYearMonth();

    }

    public static RecordYearMonth of(YearMonth value) {
        return new RecordYearMonth(value);

    }

    public YearMonth asYearMonth() {
        return value;
    }

    public boolean isPresent() {
        return nonNull(value);

    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof RecordYearMonth && sameValueAs((RecordYearMonth) obj);
    }

    private boolean sameValueAs(RecordYearMonth obj) {
        return equal(value, obj.asYearMonth());
    }

}
