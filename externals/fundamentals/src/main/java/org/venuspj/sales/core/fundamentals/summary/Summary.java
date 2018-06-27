package org.venuspj.sales.core.fundamentals.summary;

import org.venuspj.ddd.model.value.AbstractStringValue;

/**
 * 摘要欄など
 */
public class Summary extends AbstractStringValue<Summary> {

    public Summary() {
        super();
    }

    private Summary(String value) {
        super(value);
    }

    public static Summary of(String value) {
        return new Summary(value);
    }
}
