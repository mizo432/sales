package org.venuspj.sales.core.fundamentals.description;


import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Description {
    String value;

    Description() {

    }

    Description(String value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }

    public String asText() {
        return value;
    }

    public static Description empty() {
        return new Description();
    }
}
