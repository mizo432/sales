package org.venuspj.sales.core.model.sale;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SaleToCustomerCaptionTest {

    @Test
    public void asText1() {
        SaleCaption target = new SaleCaption();
        assertThat(target).isNotNull();
        assertThat(target.asText()).isNull();

    }

    @Test
    public void asText2() {
        SaleCaption target = new SaleCaption("DUMMY");
        assertThat(target).isNotNull();
        assertThat(target.asText()).isEqualTo("DUMMY");

    }
}