package org.venuspj.sales.account.model.acount;


import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class AccountPartName implements StringValue<AccountPartName> {
    private String value;

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

    @Override
    public String getValue() {
        return value;
    }

    public static AccountPartName of(String value) {
        return new AccountPartName(value);

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AccountPartName
                && sameValueAs((AccountPartName) obj);

    }

    @Override
    public int hashCode() {
        return hash(value);

    }

    @Override
    public boolean sameValueAs(AccountPartName other) {
        return equal(value, other.asText());

    }
}
