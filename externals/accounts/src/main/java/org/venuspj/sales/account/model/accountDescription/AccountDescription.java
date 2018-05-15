package org.venuspj.sales.account.model.accountDescription;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AccountDescription {
    private final String value;

    AccountDescription(String aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
