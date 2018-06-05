package org.venuspj.sales.core.fundamentals.number;


import org.venuspj.ddd.model.value.IntegerValue;

public interface NumberValue extends IntegerValue {

    @Override
    Integer asInteger();

    Number asNumber();

}
