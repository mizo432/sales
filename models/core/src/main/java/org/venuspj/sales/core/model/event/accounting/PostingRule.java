package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.core.fundamentals.amount.Amount;

public abstract class PostingRule {
    EventType type;

    PostingRule(EventType type) {
        this.type = type;
    }

    private void makeEntry(AccountingEvent event, Amount amount) {
        AbstractAccountingEntry entry = new AbstractAccountingEntry(amount, event.getWhenNoticed(), type);
        event.addResultingEntry(entry);
    }

    public void process(AccountingEvent event) {
        makeEntry(event, calculateAmount(event));
    }

    protected abstract Amount calculateAmount(AccountingEvent event);

}
