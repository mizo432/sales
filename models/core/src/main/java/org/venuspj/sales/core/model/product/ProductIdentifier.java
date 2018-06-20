package org.venuspj.sales.core.model.product;

import org.venuspj.ddd.model.entity.AbstractIntegerEntityIdentifier;

public class ProductIdentifier extends AbstractIntegerEntityIdentifier<Product, ProductIdentifier> {

    public ProductIdentifier() {
        super(Product.class);

    }

    private ProductIdentifier(Integer value) {
        super(Product.class, value);

    }

    public static ProductIdentifier of(Integer value) {
        return new ProductIdentifier(value);
    }
}
