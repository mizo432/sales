package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.venuspj.sales.core.fundamentals.name.Name;
import org.venuspj.sales.core.fundamentals.name.NameValue;

import static org.venuspj.util.objects2.Objects2.equal;

public class ThingName implements NameValue<ThingName> {
    private String value;

    public ThingName() {

    }

    public ThingName(String value) {
        this.value = value;

    }

    public static ThingName of(String value) {
        return new ThingName(value);
    }

    @Override
    public Name asName() {
        return Name.of(value);
    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean sameValueAs(ThingName other) {
        return equal(value, other.getValue());
    }
}
