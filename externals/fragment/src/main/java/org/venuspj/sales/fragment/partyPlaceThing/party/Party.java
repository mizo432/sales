package org.venuspj.sales.fragment.partyPlaceThing.party;

import org.venuspj.sales.fragment.description.party.PartyDescription;
import org.venuspj.sales.fragment.description.thing.ThingDescription;
import org.venuspj.sales.fragment.partyPlaceThing.PartyPlaceThing;
import org.venuspj.sales.fragment.partyPlaceThing.thing.Thing;

public interface Party<P extends Party<P, PD>, PD extends PartyDescription<P, PD>> extends PartyPlaceThing<P,PD> {
// extends PartyPlaceThing<Thing, ThingDescription>
}
