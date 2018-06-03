package org.venuspj.sales.account.model.accountDescription;

import org.venuspj.sales.core.fundamentals.values.StringValue;

public class AccountDescription implements StringValue {
    private final String value;

    AccountDescription(String aValue) {
        value = aValue;
    }

    public static AccountDescription of(String value) {
        return new AccountDescription(value);
    }

    @Override
    public String asText() {
        return value;
    }
}
