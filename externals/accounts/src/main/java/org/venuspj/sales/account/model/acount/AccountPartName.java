package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.values.StringValue;

public class AccountPartName implements StringValue {
    private final String value;

    public AccountPartName() {
        this.value = null;

    }

    AccountPartName(String value) {
        this.value = value;

    }

    @Override
    public String asText() {
        return value;

    }

    public static AccountPartName of(String value) {
        return new AccountPartName(value);

    }
}
