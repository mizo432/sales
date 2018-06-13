package org.venuspj.sales.core.fundamentals.description;

import org.venuspj.ddd.model.value.StringValue;

public interface DescriptionValue<D extends DescriptionValue<D>> extends StringValue<D> {

    Description asDescription();

}
