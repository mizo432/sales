package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.fundamentals.values.StringValue;

public class SaleCaption implements StringValue {
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


}
