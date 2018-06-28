package org.venuspj.sales.core.fundamentals.percentage;


import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PercentageTest {

    @Test
    public void of() {
        Percentage target = Percentage.of(10d);
        assertThat(target.equals(Percentage.of(10d)))
                .isTrue();
    }
}