package org.venuspj.sales.account;

import org.junit.Test;
import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.amount.Amount;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class TaxTest {

    @Test
    public void empty() {
        Tax actual = Tax.empty();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asLong())
                .isEqualTo(0L);
        assertThat(actual.isEmpty())
                .isTrue();

    }

    @Test
    public void yens() {
        Tax actual = Tax.yens(10L);
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asLong())
                .isEqualTo(10L);

    }

    @Test
    public void zero() {
        Tax actual = Tax.zero();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asLong())
                .isEqualTo(0L);

    }

    @Test
    public void asAmount() {
        Tax target = Tax.yens(10L);
        Amount actual = target.asAmount();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asLong())
                .isEqualTo(10L);

    }
}