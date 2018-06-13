package org.venuspj.sales.core.model.product;

import org.venuspj.sales.core.fundamentals.name.Name;
import org.venuspj.sales.core.fundamentals.name.NameValue;

import static org.venuspj.util.objects2.Objects2.equal;

public class ProductName implements NameValue<ProductName> {

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

    @Override
    public boolean sameValueAs(ProductName other) {
        return equal(value, other.value);
    }
}
