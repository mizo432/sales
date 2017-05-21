package org.venuspj.sales.core.fundamentals.amount;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class AmountTest {

    @Test
    public void testConstractor(){
        assertThat(new Amount(Integer.valueOf(1)))
                .isNotNull();

    }

}