package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.venuspj.sales.fragment.description.thing.ThingDescription;
import org.venuspj.sales.fragment.description.thing.ThingDescriptionImpl;

public class ThingImpl implements Thing {
    private ThingDescription thingDescription = new ThingDescriptionImpl();
    private ThingName name;

    public ThingImpl() {

    }

    ThingImpl(ThingName name, ThingDescription thingDescription) {
        this.name = name;
        this.thingDescription = thingDescription;

    }

    @Override
    public ThingName getName() {
        return name;
    }

    public ThingDescription getThingDescription() {
        return thingDescription;
    }

}
