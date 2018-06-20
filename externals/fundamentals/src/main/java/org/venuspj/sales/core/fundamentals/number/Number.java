package org.venuspj.sales.core.fundamentals.number;

import org.venuspj.ddd.model.value.IntegerValue;

import static org.venuspj.util.objects2.Objects2.*;

public class Number implements IntegerValue<Number>, Comparable<Number> {
    private Integer value;

    public Number(Integer aValue) {
        value = aValue;
    }

    @Override
    public int compareTo(Number o) {
        if (isNull(o)) return -1;
        return value.compareTo(o.value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Number
                && equal(this.value, ((Number) obj).value);
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    @Override
    public boolean sameValueAs(Number other) {
        return equal(this.value, ((Number) other
        ).value);
    }

    @Override
    public Integer asInteger() {
        return value;
    }

    @Override
    public String asText() {
        return value.toString();
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
