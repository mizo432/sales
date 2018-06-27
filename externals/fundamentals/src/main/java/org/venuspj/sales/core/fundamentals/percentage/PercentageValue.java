package org.venuspj.sales.core.fundamentals.percentage;

import org.venuspj.ddd.model.value.DoubleValue;

public interface PercentageValue<PV extends PercentageValue<PV>> extends DoubleValue<PV> {

    Percentage asPercentage();
}
