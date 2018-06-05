package org.venuspj.sales.core.fundamentals.name;

import org.venuspj.sales.core.fundamentals.values.StringValue;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Name implements StringValue {
    private final String value;

    public Name(String aValue) {
        value = aValue;
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
}
