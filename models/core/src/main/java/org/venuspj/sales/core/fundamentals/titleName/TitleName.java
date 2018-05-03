package org.venuspj.sales.core.fundamentals.titleName;

import static org.venuspj.sales.utils.Objects2.toStringHelper;

public class TitleName {
    private final String value;

    public TitleName(String aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .omitNullValues()
                .toString();
    }
}
