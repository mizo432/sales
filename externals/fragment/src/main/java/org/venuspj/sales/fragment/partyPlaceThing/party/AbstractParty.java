package org.venuspj.sales.fragment.partyPlaceThing.party;

import org.venuspj.sales.fragment.description.party.PartyDescription;
import org.venuspj.sales.fragment.partyPlaceThing.AbstractPartyPlaceThing;

public abstract class AbstractParty<P extends Party<P, PD>, PD extends PartyDescription<P, PD>> extends AbstractPartyPlaceThing<P, PD> {

    protected AbstractParty(PD description) {
        super(description);
    }

    protected AbstractParty() {
        super();
    }
}
