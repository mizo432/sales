package org.venuspj.sales.core.model.product;

import org.junit.Test;
import org.venuspj.sales.core.model.product.Product.ProductBuilder;
import org.venuspj.sales.core.model.product.ProductMock.ProductMockType;
import org.venuspj.sales.fragment.description.thing.ThingDescription.ThingDescriptionBuilder;
import org.venuspj.sales.fragment.partyPlaceThing.thing.ThingName;
import org.venuspj.sales.fragment.partyPlaceThing.thing.Thing.ThingBuilder;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ProductTest {

    @Test
    public void getThing() {
        Product target = new ProductBuilder()
                .withThing(new ThingBuilder()
                        .withName(ThingName.of("物品１"))
                        .withDescription(new ThingDescriptionBuilder()
                                .build())
                        .build())
                .build();

        System.out.println(toStringHelper(target).defaultConfig().toString());

    }

    @Test
    public void createMock() {
        Product target = ProductMock.createMock(ProductMockType.SIMPLE);

        System.out.println(toStringHelper(target).defaultConfig().toString());

    }
}
