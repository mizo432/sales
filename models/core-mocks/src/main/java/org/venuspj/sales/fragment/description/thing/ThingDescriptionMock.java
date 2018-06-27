package org.venuspj.sales.fragment.description.thing;

import org.venuspj.sales.fragment.description.thing.ThingDescription.ThingDescriptionBuilder;

public class ThingDescriptionMock {
    public static ThingDescription createMock(ThingDescriptionMockType thingDescriptionMockType) {
        return thingDescriptionMockType.create();
    }

    public enum ThingDescriptionMockType {
        SIMPLE {
            @Override
            public ThingDescription create() {
                return new ThingDescriptionBuilder()
                        .build();
            }
        };

        public abstract ThingDescription create();
    }
}
