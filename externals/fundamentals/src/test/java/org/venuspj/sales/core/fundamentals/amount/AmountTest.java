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

    @Test
    public void isMoreThan1() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isMoreThan(Amount.yenZero());
        assertThat(actual).isNotNull().isTrue();
    }

    @Test
    public void isMoreThan2() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isMoreThan(Amount.yen(20L));
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void isMoreThan3() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isMoreThan(Amount.yen(10L));
        assertThat(actual).isNotNull().isFalse();
    }
    @Test
    public void isPositive1() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isPositive();
        assertThat(actual).isNotNull().isTrue();
    }
    @Test
    public void isPositive2() {
        Amount target = Amount.yen(-10L);
        boolean actual = target.isPositive();
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void isPositive3() {
        Amount target = Amount.yen(0L);
        boolean actual = target.isPositive();
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void isSmallOrEqual1() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isSmallOrEqual(Amount.yen(10L));
        assertThat(actual).isNotNull().isTrue();
    }

    @Test
    public void isSmallOrEqual2() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isSmallOrEqual(Amount.yen(5L));
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void isSmallOrEqual3() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isSmallOrEqual(Amount.yen(11L));
        assertThat(actual).isNotNull().isTrue();
    }

    @Test
    public void isSmallThan1() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isSmallThan(Amount.yen(9L));
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void isSmallThan2() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isSmallThan(Amount.yen(10L));
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void isSmallThan3() {
        Amount target = Amount.yen(10L);
        boolean actual = target.isSmallThan(Amount.yen(11L));
        assertThat(actual).isNotNull().isTrue();
    }
    @Test
    public void minus() {
        Amount target = Amount.yen(10L);
        Amount actual = target.minus(Amount.yen(1L));
        assertThat(actual).isNotNull().isEqualTo(Amount.yen(9L));
    }

    @Test
    public void plus() {
        Amount target = Amount.yen(10L);
        Amount actual = target.plus(Amount.yen(1L));
        assertThat(actual).isNotNull().isEqualTo(Amount.yen(11L));
    }

    @Test
    public void hash() {
        Amount target = Amount.yen(10L);
        int actual = target.hashCode();
        assertThat(actual).isNotNull().isEqualTo(41);
    }

    @Test
    public void equal1() {
        Amount target = Amount.yen(10L);
        boolean actual = target.equals(null);
        assertThat(actual).isNotNull().isFalse();
    }

    @Test
    public void equal2() {
        Amount target = Amount.yen(10L);
        boolean actual = target.equals(10L);
        assertThat(actual).isNotNull().isFalse();
    }

}