package org.venuspj.sales.core.fundamentals.percentage;

import org.venuspj.ddd.model.value.DoubleValue;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class Percentage implements DoubleValue {
    private Double value;

    public Percentage() {

    }

    Percentage(Double value) {
        this.value = value;

    }

    public Double asValue() {
        return value;

    }

    public static Percentage of(Double value) {
        return new Percentage(value);

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Percentage && sameValueAs((Percentage) obj);
    }

    @Override
    public int hashCode() {
        return hash(value);

    }

    private boolean sameValueAs(Percentage obj) {
        return equal(value, obj.value);
    }

    @Override
    public Double asDouble() {
        return value;
    }

    @Override
    public String asText() {
        return null;
    }

    @Override
    public Double getValue() {
        return value;
    }
}
