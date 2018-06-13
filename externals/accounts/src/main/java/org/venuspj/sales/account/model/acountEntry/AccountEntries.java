package org.venuspj.sales.account.model.acountEntry;


import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class AccountEntries implements ListValue<AccountEntry> {

    private List<AccountEntry> list = newArrayList();

    public AccountEntries() {

    }

    AccountEntries(Collection<AccountEntry> list) {
        this.list.addAll(list);

    }

    public static AccountEntries create() {
        return new AccountEntries();

    }

    @Override
    public List<AccountEntry> asList() {
        return Collections.unmodifiableList(list);

    }

    @Override
    public Iterator<AccountEntry> iterator() {
        return list.iterator();
    }

    @Override
    public List<AccountEntry> getValue() {
        return list;
    }

    public static AccountEntries of(Collection<AccountEntry> list) {
        return new AccountEntries(list);

    }

    public AccountEntries getCredits() {
        return new AccountEntries(list.stream()
                .filter(AccountEntry::isCredit)
                .collect(Collectors.toList()));

    }

    public AccountEntries getDebits() {
        return new AccountEntries(list.stream()
                .filter(AccountEntry::isDebit)
                .collect(Collectors.toList()));

    }

}
