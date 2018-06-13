package org.venuspj.sales.core.model.materializedClaim;

import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDateValue;

import java.time.LocalDate;

public class DateOfIssue implements RecordDateValue {
    private LocalDate value;

    public DateOfIssue() {

    }

    DateOfIssue(LocalDate value) {
        this.value = value;

    }

    public DateOfIssue of(LocalDate value) {
        return new DateOfIssue(value);

    }

    public LocalDate asDate(){
        return value;

    }

    @Override
    public RecordDate asRecordDate() {
        return RecordDate.of(value);
    }
}
