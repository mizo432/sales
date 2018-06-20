package org.venuspj.sales.core.model.product;

import org.junit.Test;
import org.venuspj.sales.core.model.product.ProductImpl.ProductBuilder;
import org.venuspj.sales.fragment.partyPlaceThing.thing.Thing;

import static org.junit.Assert.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ProductImplTest {

    @Test
    public void getThing() {
        Product target = new ProductBuilder()
                .withThing(new Thing() {
                    @Override
                    public int hashCode() {
                        return super.hashCode();
                    }
                }).withEntityIdentifier(ProductIdentifier.of(1))
                .build();

        System.out.println(toStringHelper(target).defaultConfig().toString());

    }
}