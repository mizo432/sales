package org.venuspj.sales.account.model.acount.accountDescription;

import org.venuspj.sales.core.fundamentals.description.Description;
import org.venuspj.sales.core.fundamentals.description.DescriptionValue;

import static org.venuspj.util.objects2.Objects2.equal;

public class AccountDescription implements DescriptionValue<AccountDescription> {
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

    @Override
    public boolean sameValueAs(AccountDescription other) {
        return equal(value, other.value);
    }
}
