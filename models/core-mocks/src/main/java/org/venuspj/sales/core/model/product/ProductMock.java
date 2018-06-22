package org.venuspj.sales.core.model.product;

import org.venuspj.sales.core.model.product.Product.ProductBuilder;
import org.venuspj.sales.fragment.partyPlaceThing.thing.ThingMock;
import org.venuspj.sales.fragment.partyPlaceThing.thing.ThingMock.ThingMockType;

public class ProductMock {
    public static Product createMock(ProductMockType productMockType) {
        return productMockType.create();
    }

    public enum ProductMockType {
        SIMPLE {
            @Override
            public Product create() {
                return new ProductBuilder()
                        .withEntityIdentifier(ProductIdentifier.of(1L))
                        .withThing(ThingMock.createMock(ThingMockType.SIMPLE))
                        .build();
            }
        };

        public abstract Product create();
    }
}
