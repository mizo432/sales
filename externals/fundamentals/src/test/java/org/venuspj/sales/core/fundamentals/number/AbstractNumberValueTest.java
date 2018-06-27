package org.venuspj.sales.core.fundamentals.number;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AbstractNumberValueTest {

    @Test
    public void asNumber() {
        ConcreteNumber target = ConcreteNumber.of(10);
        Number actual = target.asNumber();

        System.out.println(toStringHelper(target).defaultConfig().toString());
        System.out.println(toStringHelper(actual).defaultConfig().toString());
        assertThat(actual)
                .isNotNull();

        assertThat(actual.asInteger())
                .isEqualTo(10);
    }

    private static class ConcreteNumber extends AbstractNumberValue<ConcreteNumber> {
        public ConcreteNumber() {
            super();
        }

        public ConcreteNumber(Integer value) {
            super(value);
        }

        public static ConcreteNumber of(Integer value) {
            return new ConcreteNumber(value);
        }
    }
}