package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDatetime;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;

/**
 */
public class Event {
    RecordDatetime recordDatetime;
    Event(){}
    public Event(RecordDatetime aRecordDatetime){
        recordDatetime = aRecordDatetime;
    }
    public RecordDatetime recordDatetime() {
        return recordDatetime;
    }

    public RecordYearMonth recordYearMonth(){
        return recordDatetime.recordYearMonth();

    }
}
