package org.venuspj.sales.core.model.product;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ProductTest {

    @Test
    public void test() {
        Product target = ProductMock.createMock(ProductMock.ProductMockType.SIMPLE);
        System.out.println(toStringHelper(target).defaultConfig().toString());

    }
}
