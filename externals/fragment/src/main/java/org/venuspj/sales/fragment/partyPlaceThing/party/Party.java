package org.venuspj.sales.fragment.partyPlaceThing.party;

import org.venuspj.sales.fragment.description.party.PartyDescription;
import org.venuspj.sales.fragment.partyPlaceThing.PartyPlaceThing;

public interface Party<P extends Party<P, PD>, PD extends PartyDescription<P, PD>> extends PartyPlaceThing<P,PD> {

}
