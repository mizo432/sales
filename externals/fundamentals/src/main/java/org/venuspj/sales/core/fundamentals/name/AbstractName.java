package org.venuspj.sales.core.fundamentals.name;


import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public abstract class AbstractName<AN extends NameValue<AN>> implements NameValue<AN> {
    private final String value;

    protected AbstractName() {
        this.value = null;

    }

    protected AbstractName(String value) {
        this.value = value;

    }

    @Override
    public String asText() {
        return value;

    }

    @Override
    public Name asName() {
        return Name.of(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object obj) {
        return obj instanceof NameValue && sameValueAs((AN) obj);
    }

    @Override
    public boolean sameValueAs(AN other) {
        return equal(value, asText());
    }

    @Override
    public int hashCode() {
        return hash(value);
    }
}
