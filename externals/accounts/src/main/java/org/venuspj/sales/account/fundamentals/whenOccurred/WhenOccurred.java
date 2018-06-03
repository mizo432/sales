package org.venuspj.sales.account.fundamentals.whenOccurred;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.time.LocalDateTime;

public class WhenOccurred implements RecordDateTimeValue {
    private LocalDateTime value;

    public WhenOccurred() {
    }

    WhenOccurred(LocalDateTime value) {
        this.value = value;
    }

    public static WhenOccurred of(RecordDateTimeValue recordDateTimeValue) {
        return of(recordDateTimeValue.asRecordDateTime().asLocalDateTime());

    }

    public static WhenOccurred of(LocalDateTime value) {
        return new WhenOccurred(value);

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
