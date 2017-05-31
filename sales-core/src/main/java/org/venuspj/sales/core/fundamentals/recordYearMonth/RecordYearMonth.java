package org.venuspj.sales.core.fundamentals.recordYearMonth;

import org.venuspj.sales.externals.Objects2;

import java.time.YearMonth;

/**
 */
public class RecordYearMonth {
    YearMonth yearMonth;

    RecordYearMonth() {

    }

    public RecordYearMonth(YearMonth aYearMonth) {
        yearMonth = aYearMonth;
    }

    public boolean isPresent() {
        return Objects2.nonNull(yearMonth);
    }
}
