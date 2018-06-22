package org.venuspj.sales.core.model.product;

import org.venuspj.ddd.model.entity.AbstractLongEntityIdentifier;

public class ProductIdentifier extends AbstractLongEntityIdentifier<Product, ProductIdentifier> {
    public ProductIdentifier() {
        super(Product.class);
    }

    private ProductIdentifier(Long value) {
        super(Product.class, value);

    }

    public static ProductIdentifier of(Long value) {
        return new ProductIdentifier(value);
    }
}
