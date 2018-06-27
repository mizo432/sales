package org.venuspj.sales.fragment.description.party;

import org.venuspj.sales.fragment.description.Description;
import org.venuspj.sales.fragment.partyPlaceThing.party.Party;

public interface PartyDescription<P extends Party<P, PD>, PD extends PartyDescription<P, PD>> extends Description<P, PD> {

}
