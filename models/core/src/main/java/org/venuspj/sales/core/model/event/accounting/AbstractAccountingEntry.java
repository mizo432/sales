package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.account.fundamentals.whenNoticed.WhenNoticed;
import org.venuspj.sales.account.model.acount.AccountAmount;

public class AbstractAccountingEntry {
    private final AccountAmount accountAmount;
    private final WhenNoticed whenNoticed;
    private final EventType type;

    public AbstractAccountingEntry() {
        this.accountAmount = AccountAmount.yenZero();
        this.whenNoticed = new WhenNoticed();
        this.type = EventType.UNKNOWN;

    }

    public AbstractAccountingEntry(AccountAmount accountAmount, WhenNoticed whenNoticed, EventType type) {
        this.accountAmount = accountAmount;
        this.whenNoticed = whenNoticed;
        this.type = type;
    }

}
