package org.venuspj.sales.core.fundamentals.amount;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AmountTest {

    @Test
    public void testConstructor() {
        Amount actual = new Amount(1L);
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asLong())
                .isNotNull()
                .isEqualTo(1L);

    }

    @Test
    public void yenZero() {
        Amount actual = Amount.yenZero();
        assertThat(actual).isNotNull();
        assertThat(actual.asLong())
                .isNotNull()
                .isEqualTo(0);

    }

    @Test
    public void yen() {
        Amount actual = Amount.yen(10L);
        assertThat(actual).isNotNull();
        assertThat(actual.asLong())
                .isNotNull()
                .isEqualTo(10);
    }
}