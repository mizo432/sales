package org.venuspj.sales.core.fundamentals.description;


import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
                .defaultConfig()
                .toString();
    }

    public static Description empty() {
        return new Description();
    }
}
