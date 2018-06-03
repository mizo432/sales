package org.venuspj.sales.core.model.event.accounting;

import org.venuspj.sales.account.model.acount.AccountAmount;

public abstract class PostingRule {
    EventType type;

    PostingRule(EventType type) {
        this.type = type;
    }

    private void makeEntry(AccountingEvent event, AccountAmount accountAmount) {
        AbstractAccountingEntry entry = new AbstractAccountingEntry(accountAmount, event.getWhenNoticed(), type);
        event.addResultingEntry(entry);
    }

    public void process(AccountingEvent event) {
        makeEntry(event, calculateAmount(event));
    }

    protected abstract AccountAmount calculateAmount(AccountingEvent event);


}
