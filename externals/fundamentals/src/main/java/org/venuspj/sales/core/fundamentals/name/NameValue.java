package org.venuspj.sales.core.fundamentals.name;


import org.venuspj.ddd.model.value.StringValue;

public interface NameValue<N extends NameValue<N>> extends StringValue<N> {

    Name asName();

}
