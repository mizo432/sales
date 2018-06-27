package org.venuspj.sales.core.model.product;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ProductNameTest {

    @Test
    public void of() {
        ProductName target = ProductName.of("DUMMY");
        String actual = target.asText();
        assertThat(actual)
                .isEqualTo("DUMMY");
    }
}