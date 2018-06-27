package org.venuspj.sales.core.fundamentals.number;

import org.venuspj.ddd.model.value.AbstractIntegerValue;

import static org.venuspj.util.objects2.Objects2.isNull;

public class Number extends
        AbstractIntegerValue<Number> implements Comparable<Number> {

    public Number() {
        super();
    }

    protected Number(Integer value) {
        super(value);
    }

    public static Number of(Integer value) {
        return new Number(value);
    }

    public static Number zero() {
        return of(0);
    }

    @Override
    public int compareTo(Number o) {
        if (isNull(o)) return -1;
        return getValue().compareTo(o.getValue());
    }

}
