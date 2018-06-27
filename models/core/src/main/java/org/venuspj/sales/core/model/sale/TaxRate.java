package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.percentage.AbstractPercentageValue;
import org.venuspj.sales.core.fundamentals.percentage.Percentage;

/**
 * 消費税率
 */
public class TaxRate extends AbstractPercentageValue<TaxRate> {

    public TaxRate() {
        super();

    }

    TaxRate(Double value) {
        super(value);

    }

    @Override
    public Percentage asPercentage() {
        return Percentage.of(value);

    }

    public static TaxRate of(Double value) {
        return new TaxRate(value);

    }

    public Double asValue() {
        return value;

    }
}
