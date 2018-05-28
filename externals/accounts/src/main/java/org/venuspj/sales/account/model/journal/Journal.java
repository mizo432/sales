package org.venuspj.sales.account.model.journal;

import org.venuspj.sales.core.fundamentals.values.ListValue;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class Journal implements ListValue<JournalEntry> {
    List<JournalEntry> list = newArrayList();

    public Journal() {
    }

    Journal(Collection<JournalEntry> list) {
        this.list.addAll(list);
    }

    @Override
    public List<JournalEntry> asList() {
        return null;
    }

    public static Journal of(Collection<JournalEntry> list) {
        return new Journal(list);
    }
}
