package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.percentage.Percentage;
import org.venuspj.sales.core.fundamentals.percentage.PercentageValue;

/**
 * 消費税率
 */
public class TaxRate implements PercentageValue {
    private Double value;

    public TaxRate() {

    }

    TaxRate(Double value) {
        this.value = value;

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
