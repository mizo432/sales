package org.venuspj.sales.account.fundamentals.whenNoticed;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;
import org.venuspj.util.collect.ComparisonChain;

import java.time.LocalDateTime;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

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
        return ComparisonChain
                .start()
                .compare(asRecordDateTime(), o.asRecordDateTime())
                .result();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof WhenNoticed) && sameValueAs((WhenNoticed) obj);
    }

    private boolean sameValueAs(WhenNoticed obj) {
        return equal(value, obj.value);

    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    public WhenNoticed atEndOfDay() {
        return WhenNoticed.of(asRecordDateTime().atEndOfDay());
    }
}
