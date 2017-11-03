package org.venuspj.sales.fundamentals.string;

public abstract class AbstractStringValue implements StringValue {

    protected String value;

    protected AbstractStringValue(){

    }

    protected AbstractStringValue(String aValue){
        value = aValue;
    }

    @Override
    public String asText() {
        return value;
    }

}
