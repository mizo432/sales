package org.venuspj.sales.core.fundamentals.description;


import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Description implements StringValue<Description> {
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

    @Override
    public boolean sameValueAs(Description other) {
        return equal(value, other.value);
    }
}
