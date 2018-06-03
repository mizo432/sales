package org.venuspj.sales.core.model.sale;

import com.google.common.collect.ComparisonChain;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

import java.time.LocalDateTime;

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

}
