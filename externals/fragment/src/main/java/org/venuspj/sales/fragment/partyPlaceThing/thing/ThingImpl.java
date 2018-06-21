package org.venuspj.sales.fragment.partyPlaceThing.thing;

public class ThingImpl implements Thing {
    private ThingName name;

    public ThingImpl() {

    }

    ThingImpl(ThingName name) {
        this.name = name;

    }

    @Override
    public ThingName getName() {
        return name;
    }
}
