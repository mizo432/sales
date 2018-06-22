package org.venuspj.sales.fragment.partyPlaceThing;

import org.venuspj.sales.fragment.description.Description;

public abstract class AbstractPartyPlaceThing<PPT extends PartyPlaceThing<PPT, D>, D extends Description<PPT, D>> implements PartyPlaceThing<PPT, D> {

    protected D description;

    protected AbstractPartyPlaceThing() {

    }

    protected AbstractPartyPlaceThing(D description) {
        this.description = description;

    }

    public D getDescription() {
        return description;
    }

}
