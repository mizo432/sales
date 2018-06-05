package org.venuspj.sales.core.model.product;

import org.venuspj.sales.core.fundamentals.name.Name;
import org.venuspj.sales.core.fundamentals.name.NameValue;

public class ProductName implements NameValue {

    private final String value;

    public ProductName() {
        this.value = null;
    }

    ProductName(String value) {
        this.value = value;
    }

    @Override
    public Name asName() {
        return Name.of(value);
    }

    @Override
    public String asText() {
        return value;
    }

    public static ProductName of(String value) {
        return new ProductName(value);
    }
}
