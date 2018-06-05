package org.venuspj.sales.account.model.accountDescription;

import org.venuspj.sales.core.fundamentals.description.Description;
import org.venuspj.sales.core.fundamentals.description.DescriptionValue;

public class AccountDescription implements DescriptionValue {
    private final String value;

    AccountDescription(String value) {
        this.value = value;

    }

    public static AccountDescription of(String value) {
        return new AccountDescription(value);

    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public Description asDescription() {
        return Description.of(value);
    }
}
