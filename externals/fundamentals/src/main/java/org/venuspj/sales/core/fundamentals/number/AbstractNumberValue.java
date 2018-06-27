package org.venuspj.sales.core.fundamentals.number;


import org.venuspj.ddd.model.value.AbstractIntegerValue;

public abstract class AbstractNumberValue<ANV extends AbstractIntegerValue<ANV>> extends AbstractIntegerValue<ANV> implements NumberValue<ANV> {

    protected AbstractNumberValue() {
        super();
    }

    protected AbstractNumberValue(Integer value) {
        super(value);
    }

    @Override
    public Number asNumber() {
        return Number.of(value);
    }

}
