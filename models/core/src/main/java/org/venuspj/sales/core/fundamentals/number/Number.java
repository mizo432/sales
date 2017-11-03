package org.venuspj.sales.core.fundamentals.number;

import static org.venuspj.sales.utils.Objects2.isNull;

public class Number implements Comparable<Number> {
    private final Integer value;

    public Number(Integer aValue) {
        value = aValue;
    }

    @Override
    public int compareTo(Number o) {
        if (isNull(o)) return -1;
        return value.compareTo(o.value);
    }
}
