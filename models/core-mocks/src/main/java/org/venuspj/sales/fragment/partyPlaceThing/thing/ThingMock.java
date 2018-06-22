package org.venuspj.sales.fragment.partyPlaceThing.thing;

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
                        .build();
            }
        };

        public abstract Thing create();
    }
}
