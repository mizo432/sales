package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDatetime.DateTimeValue;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDatetime;

public class AccountingEntry {
    private final Amount amount;
    private final RecordDatetime whenNoticed;
    private final EventType type;

    public AccountingEntry(){
        this.amount = Amount.yenZero();
        this.whenNoticed = new RecordDatetime();
        this.type = EventType.UNKNOWN;

    }

    public AccountingEntry(Amount amount, DateTimeValue whenNoticed, EventType type) {
        this.amount = amount;
        this.whenNoticed = new RecordDatetime(whenNoticed.asDateTime());
        this.type = type;
    }

}
