package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.venuspj.sales.fragment.description.thing.ThingDescriptionMock;
import org.venuspj.sales.fragment.description.thing.ThingDescriptionMock.ThingDescriptionMockType;

public class ThingMock {
    public static Thing createMock(ThingMockType thingMockType) {
        return thingMockType.create();
    }

    public enum ThingMockType {
        SIMPLE {
            @Override
            public Thing create() {
                return new Thing
                        .ThingBuilder()
                        .withName(ThingName.of("物1"))
                        .withDescription(ThingDescriptionMock.createMock(ThingDescriptionMockType.SIMPLE))
                        .build();
            }
        };

        public abstract Thing create();
    }
}
