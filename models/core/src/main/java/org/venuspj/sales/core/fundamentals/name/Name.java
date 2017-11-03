package org.venuspj.sales.core.fundamentals.name;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

public class Name {
    private final String value;

    public Name(String aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .omitNullValues()
                .toString();
    }

}
