package org.venuspj.sales.core.model.sale;


import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.equal;

public class SaleCaption implements StringValue<SaleCaption> {
    private String value;

    public SaleCaption() {

    }

    SaleCaption(String value) {
        this.value = value;

    }

    @Override
    public String asText() {
        return value;

    }

    public static SaleCaption of(String value) {
        return new SaleCaption(value);

    }


    @Override
    public boolean sameValueAs(SaleCaption other) {
        return equal(value, other.value);
    }
}
