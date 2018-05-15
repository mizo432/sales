package org.venuspj.sales.core.fundamentals.event;

import com.google.common.collect.ComparisonChain;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.time.LocalDateTime;

import static org.venuspj.util.objects2.Objects2.isNull;

public class WhenOccurred implements RecordDateTimeValue {
    private LocalDateTime value;

    public WhenOccurred(RecordDateTime value) {
        this.value = value.asLocalDateTime();
    }

    public WhenOccurred() {

    }

    @Override
    public RecordDateTime asRecordDateTime() {
        return new RecordDateTime(value);
    }


    @Override
    public int compareTo(RecordDateTimeValue o) {
        if (isNull(o)) return -1;
        return ComparisonChain
                .start()
                .compare(asRecordDateTime(), o.asRecordDateTime())
                .result();

    }
}
