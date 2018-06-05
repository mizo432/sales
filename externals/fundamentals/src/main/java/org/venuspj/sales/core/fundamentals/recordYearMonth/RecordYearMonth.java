package org.venuspj.sales.core.fundamentals.recordYearMonth;

import java.time.YearMonth;

import static org.venuspj.util.objects2.Objects2.nonNull;

/**
 */
public class RecordYearMonth {
    YearMonth yearMonth;

    public RecordYearMonth() {

    }

    RecordYearMonth(YearMonth yearMonth) {
        this.yearMonth = yearMonth;

    }

    public static RecordYearMonth empty() {
        return new RecordYearMonth();

    }

    public static RecordYearMonth of(YearMonth value) {
        return new RecordYearMonth(value);

    }

    public boolean isPresent() {
        return nonNull(yearMonth);

    }
}
