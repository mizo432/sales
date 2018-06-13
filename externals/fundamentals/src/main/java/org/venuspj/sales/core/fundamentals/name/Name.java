package org.venuspj.sales.core.fundamentals.name;


import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.hash;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Name implements StringValue<Name> {
    private final String value;

    public Name() {
        this.value = null;

    }

    Name(String value) {
        this.value = value;

    }

    public static Name of(String value) {
        return new Name(value);

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();

    }

    @Override
    public String asText() {
        return value;

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Name && sameValueAs((Name) obj);
    }

    @Override
    public boolean sameValueAs(Name other) {
        return false;
    }

    @Override
    public int hashCode() {
        return hash(value);
    }
}
