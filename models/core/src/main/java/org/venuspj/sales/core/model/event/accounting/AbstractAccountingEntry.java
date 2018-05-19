package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;

public class AbstractAccountingEntry {
    private final Amount amount;
    private final RecordDateTime whenNoticed;
    private final EventType type;

    public AbstractAccountingEntry() {
        this.amount = Amount.yenZero();
        this.whenNoticed = new RecordDateTime();
        this.type = EventType.UNKNOWN;

    }

    public AbstractAccountingEntry(Amount amount, RecordDateTimeValue whenNoticed, EventType type) {
        this.amount = amount;
        this.whenNoticed = new RecordDateTime(whenNoticed.asRecordDateTime().asLocalDateTime());
        this.type = type;
    }

}
