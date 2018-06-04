package org.venuspj.sales.account.fundamentals.whenOccurred;

import org.venuspj.sales.account.fundamentals.whenNoticed.WhenNoticed;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;
import org.venuspj.util.collect.ComparisonChain;

import java.time.LocalDateTime;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

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
        return ComparisonChain
                .start()
                .compare(asRecordDateTime(), o.asRecordDateTime())
                .result();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof WhenOccurred) && sameValueAs((WhenOccurred) obj);
    }

    private boolean sameValueAs(WhenOccurred obj) {
        return equal(value, obj.value);

    }

    @Override
    public int hashCode() {
        return hash(value);
    }
}
