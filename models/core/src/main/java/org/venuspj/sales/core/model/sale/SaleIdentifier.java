package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.values.LongValue;

public class SaleIdentifier implements LongValue {
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
}
