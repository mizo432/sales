package org.venuspj.sales.core.fundamentals.percentage;

import org.venuspj.ddd.model.value.AbstractDoubleValue;

public abstract class AbstractPercentageValue<ASV extends AbstractPercentageValue<ASV>> extends AbstractDoubleValue<ASV> implements PercentageValue<ASV> {

    public AbstractPercentageValue(Double value) {
        super(value);
    }

    public AbstractPercentageValue() {
        super();
    }

    @Override
    public Percentage asPercentage() {
        return Percentage.of(value);
    }

    @Override
    public String asText() {
        return value.toString() + "%";

    }
}
