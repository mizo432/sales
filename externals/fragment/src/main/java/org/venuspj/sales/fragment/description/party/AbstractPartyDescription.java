package org.venuspj.sales.fragment.description.party;

import org.venuspj.sales.fragment.description.AbstractDescription;
import org.venuspj.sales.fragment.partyPlaceThing.party.Party;

public class AbstractPartyDescription<P extends Party<P, PD>, PD extends PartyDescription<P, PD>>
        extends AbstractDescription<P, PD>
        implements PartyDescription<P, PD> {

}
