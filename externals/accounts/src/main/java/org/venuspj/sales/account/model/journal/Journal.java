package org.venuspj.sales.account.model.journal;


import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
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

    @Override
    public Iterator<JournalEntry> iterator() {
        return list.iterator();
    }

    @Override
    public List<JournalEntry> getValue() {
        return list;
    }

    public static Journal of(Collection<JournalEntry> list) {
        return new Journal(list);
    }
}
