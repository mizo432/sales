package org.venuspj.sales.core.model.product;

import org.venuspj.sales.fragment.partyPlaceThing.thing.ThingMock;

public class ProductMock {
    public static Product createMock(ProductMockType productMockType) {
        return productMockType.create();
    }

    public enum ProductMockType {
        SIMPLE {
            @Override
            public Product create() {
                return new Product
                        .ProductBuilder()
                        .withEntityIdentifier(ProductIdentifier.of(1L))
                        .withThing(ThingMock.createMock(ThingMock.ThingMockType.SIMPLE))
                        .build();
            }
        };

        public abstract Product create();
    }
}
