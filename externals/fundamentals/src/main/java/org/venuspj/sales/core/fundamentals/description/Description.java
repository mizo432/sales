package org.venuspj.sales.core.fundamentals.description;


import org.venuspj.sales.core.fundamentals.values.StringValue;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Description implements StringValue {
    String value;

    public Description() {

    }

    Description(String value) {
        this.value = value;

    }

    public static Description of(String value) {
        return new Description(value);

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

    public static Description empty() {
        return new Description();
    }
}
