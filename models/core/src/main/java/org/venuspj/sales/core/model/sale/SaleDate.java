package org.venuspj.sales.core.model.sale;

import com.google.common.collect.ComparisonChain;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.time.LocalDateTime;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class SaleDate implements RecordDateTimeValue {
    private LocalDateTime value;

    public SaleDate() {

    }

    SaleDate(LocalDateTime value) {
        this.value = value;
    }


    @Override
    public RecordDateTime asRecordDateTime() {
        return RecordDateTime.of(value);
    }

    @Override
    public int compareTo(RecordDateTimeValue o) {
        return ComparisonChain.start()
                .compare(asRecordDateTime(), o.asRecordDateTime())
                .result();
    }

    public static SaleDate of(LocalDateTime value) {
        return new SaleDate(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SaleDate && sameValueAs((SaleDate) obj);
    }

    private boolean sameValueAs(SaleDate obj) {
        return equal(value,obj.value);

    }

    @Override
    public int hashCode() {
        return hash(value);
    }
}
