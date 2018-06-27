package org.venuspj.sales.core.fundamentals.percentage;

import org.venuspj.ddd.model.value.AbstractDoubleValue;
import org.venuspj.ddd.model.value.DoubleValue;

public class Percentage extends AbstractDoubleValue<Percentage> implements DoubleValue<Percentage> {

    public Percentage() {

    }

    private Percentage(Double value) {
        super(value);

    }

    public static Percentage of(Double value) {
        return new Percentage(value);

    }


}
