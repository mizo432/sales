package org.venuspj.sales.core.model.accountManagement.account;

import org.junit.Test;
import org.venuspj.sales.core.fundamentals.amount.Amount;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class TaxTest {

    @Test
    public void empty() {
        Tax actual = Tax.empty();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asInteger())
                .isNull();
    }

    @Test
    public void yens() {
        Tax actual = Tax.yens(10);
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asInteger())
                .isEqualTo(10);
    }

    @Test
    public void zero() {
        Tax actual = Tax.zero();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asInteger())
                .isEqualTo(0);
    }

    @Test
    public void asAmount() {
        Tax target = Tax.yens(10);
        Amount actual = target.asAmount();
        assertThat(actual)
                .isNotNull();
        assertThat(actual.asInteger())
                .isEqualTo(10);
    }
}