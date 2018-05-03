package org.venuspj.sales.core.fundamentals.description;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

public class Description {
    String value;

    Description() {

    }

    Description(String aValue) {
        value = aValue;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .omitNullValues()
                .toString();
    }

    public static Description empty() {
        return new Description();
    }
}
