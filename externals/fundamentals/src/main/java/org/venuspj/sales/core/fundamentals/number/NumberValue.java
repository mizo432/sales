package org.venuspj.sales.core.fundamentals.number;


import org.venuspj.ddd.model.value.IntegerValue;

public interface NumberValue<N extends IntegerValue<N>> extends IntegerValue<N> {

    Number asNumber();

}
