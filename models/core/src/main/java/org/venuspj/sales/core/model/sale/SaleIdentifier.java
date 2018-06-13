package org.venuspj.sales.core.model.sale;

import org.venuspj.ddd.model.value.LongValue;

import static org.venuspj.util.objects2.Objects2.hash;

public class SaleIdentifier implements LongValue<SaleIdentifier> {
    private Long value;

    public SaleIdentifier() {

    }

    SaleIdentifier(Long value) {
        this.value = value;
    }

    public static SaleIdentifier of(Long value) {
        return new SaleIdentifier(value);
    }

    public static SaleIdentifier create() {
        return new SaleIdentifier();
    }

    @Override
    public Long asLong() {
        return value;
    }

    @Override
    public String asText() {
        return value.toString();
    }

    @Override
    public Long getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SaleIdentifier && sameValueAs((SaleIdentifier) obj);
    }

    @Override
    public boolean sameValueAs(SaleIdentifier other) {
        return false;
    }
}
