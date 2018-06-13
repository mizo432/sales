package org.venuspj.sales.core.fundamentals.titleName;

import org.venuspj.sales.core.fundamentals.name.Name;
import org.venuspj.sales.core.fundamentals.name.NameValue;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class TitleName implements NameValue<TitleName> {
    private final String value;

    public TitleName() {
        this.value = null;

    }

    TitleName(String value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();

    }

    @Override
    public Name asName() {
        return Name.of(value);

    }

    @Override
    public String asText() {
        return value;

    }

    public static TitleName of(String value) {
        return new TitleName(value);
    }

    @Override
    public boolean sameValueAs(TitleName other) {
        return equal(value, other.value);
    }
}
