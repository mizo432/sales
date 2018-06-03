package org.venuspj.sales.core.fundamentals.event;

import com.google.common.collect.ComparisonChain;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.time.LocalDateTime;

import static org.venuspj.util.objects2.Objects2.*;

public class WhenOccurred implements RecordDateTimeValue {
    private LocalDateTime value;

    public WhenOccurred(RecordDateTime value) {
        this.value = value.asLocalDateTime();
    }

    public WhenOccurred() {

    }

    @Override
    public RecordDateTime asRecordDateTime() {
        return RecordDateTime.of(value);
    }


    @Override
    public int compareTo(RecordDateTimeValue o) {
        if (isNull(o)) return -1;
        return ComparisonChain
                .start()
                .compare(asRecordDateTime(), o.asRecordDateTime())
                .result();

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof WhenOccurred && sameValueAs((WhenOccurred) obj);

    }

    public boolean sameValueAs(WhenOccurred other) {
        return nonNull(other) && equal(value, other.value);

    }

    @Override
    public int hashCode() {
        return hash(value);
    }
}
