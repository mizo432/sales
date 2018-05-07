package org.venuspj.sales.core.model.accountManagement.account.acountEntry;

import org.venuspj.sales.core.fundamentals.listValue.ListValue;

import java.util.Collections;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class AccountEntries implements ListValue<AccountEntry>, AccountEntry {

    List<AccountEntry> list = newArrayList();

    public static AccountEntries create() {
        return new AccountEntries();
    }

    @Override
    public List<AccountEntry> asList() {
        return Collections.unmodifiableList(list);
    }


}
