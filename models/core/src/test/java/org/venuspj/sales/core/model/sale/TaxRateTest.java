package org.venuspj.sales.core.model.sale;

import org.junit.Test;
import org.venuspj.sales.core.fundamentals.percentage.Percentage;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class TaxRateTest {

    @Test
    public void asPercentage() {
        TaxRate target = TaxRate.of(Double.valueOf(1.0));
        Percentage actual = target.asPercentage();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Percentage.of(1.0));

    }

    @Test
    public void of() {
        TaxRate actual = TaxRate.of(Double.valueOf(1.0));
        assertThat(actual).isNotNull();
    }

    @Test
    public void asValue() {
        TaxRate target = TaxRate.of(Double.valueOf(1.0));
        Double actual = target.asValue();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Double.valueOf(1.0));

    }

}