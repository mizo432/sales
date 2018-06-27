package org.venuspj.sales.core.model.product;

import org.venuspj.sales.core.fundamentals.name.AbstractName;

public class ProductName extends AbstractName<ProductName> {

    public ProductName() {
        super();
    }

    ProductName(String value) {
        super(value);

    }

    public static ProductName of(String value) {
        return new ProductName(value);
    }

}
