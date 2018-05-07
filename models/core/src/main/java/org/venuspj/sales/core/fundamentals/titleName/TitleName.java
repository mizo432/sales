package org.venuspj.sales.core.fundamentals.titleName;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class TitleName {
    private final String value;

    public TitleName(String aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
