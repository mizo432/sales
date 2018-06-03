package org.venuspj.sales.account.fundamentals.whenNoticed;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.time.LocalDateTime;

public class WhenNoticed implements RecordDateTimeValue {

    private LocalDateTime value;

    public WhenNoticed() {
    }

    WhenNoticed(LocalDateTime value) {
        this.value = value;
    }

    public static WhenNoticed of(RecordDateTimeValue recordDateTimeValue) {
        return of(recordDateTimeValue.asRecordDateTime().asLocalDateTime());

    }

    public static WhenNoticed of(LocalDateTime value) {
        return new WhenNoticed(value);

    }

    @Override
    public RecordDateTime asRecordDateTime() {
        return RecordDateTime.of(value);
    }

    @Override
    public int compareTo(RecordDateTimeValue o) {
        return 0;
    }
}
