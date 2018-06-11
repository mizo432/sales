package org.venuspj.sales.account.model.acount;

import org.junit.Test;
import org.venuspj.sales.core.fundamentals.amount.Amount;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BalanceTest {

    @Test
    public void asAmount() {
        Balance target = Balance.yens(10L);
        Amount actual = target.asAmount();

        assertThat(actual)
                .isEqualTo(Amount.yen(10L));
    }

    @Test
    public void asLong() {
        Balance target = Balance.yens(10L);
        Long actual = target.asLong();

        assertThat(actual)
                .isEqualTo(10L);

    }

    @Test
    public void yenZero() {
        Balance target = Balance.yenZero();
        Long actual = target.asLong();

        assertThat(actual)
                .isEqualTo(0L);
    }

}