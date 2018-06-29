package org.venuspj.sales.core.model.statementOfSettlements;

import org.junit.Test;
import org.venuspj.sales.core.fundamentals.amount.Amount;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StatementAmountTest {

    @Test
    public void asAmount1() {
        StatementAmount target = createNullAmount();
        Amount actual = target.asAmount();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(new Amount());
    }

    @Test
    public void asAmount2() {
        StatementAmount target = createZeroAmount();
        Amount actual = target.asAmount();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Amount.yenZero());
    }

    @Test
    public void asAmount3() {
        StatementAmount target = createNegativeAmount();
        Amount actual = target.asAmount();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Amount.yens(3L));
    }

    @Test
    public void asAmount4() {
        StatementAmount target = createPositiveAmount();
        Amount actual = target.asAmount();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(Amount.yens(3L));
    }


    @Test
    public void asLong1() {
        StatementAmount target = createNullAmount();
        Long actual = target.asLong();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(0);
    }

    @Test
    public void asLong2() {
        StatementAmount target = createZeroAmount();
        Long actual = target.asLong();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(0L);
    }

    @Test
    public void asLong3() {
        StatementAmount target = createNegativeAmount();
        Long actual = target.asLong();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(3L);
    }

    @Test
    public void asLong4() {
        StatementAmount target = createPositiveAmount();
        Long actual = target.asLong();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(3L);
    }

    private StatementAmount createNullAmount() {
        return new StatementAmount();
    }

    private StatementAmount createZeroAmount() {
        return StatementAmount.zeroYen();
    }

    private StatementAmount createPositiveAmount() {
        return StatementAmount.yens(3L);
    }

    private StatementAmount createNegativeAmount() {
        return StatementAmount.yens(-3L);
    }
}