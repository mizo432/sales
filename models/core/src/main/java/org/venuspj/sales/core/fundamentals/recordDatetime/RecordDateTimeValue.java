package org.venuspj.sales.core.fundamentals.recordDatetime;

import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;

public interface RecordDateTimeValue extends Comparable<RecordDateTimeValue> {

    RecordDateTime asRecordDateTime();

}
