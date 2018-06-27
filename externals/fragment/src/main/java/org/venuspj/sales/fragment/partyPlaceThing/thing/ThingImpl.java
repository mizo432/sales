package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.venuspj.sales.fragment.description.thing.ThingDescription;
import org.venuspj.sales.fragment.partyPlaceThing.AbstractPartyPlaceThing;

public class ThingImpl
        extends AbstractPartyPlaceThing<Thing, ThingDescription> implements Thing {

    private ThingName name;

    public ThingImpl() {

    }

    ThingImpl(ThingDescription thingDescription, ThingName name) {
        super(thingDescription);
        this.name = name;

    }

    @Override
    public ThingName getName() {
        return name;
    }

}
