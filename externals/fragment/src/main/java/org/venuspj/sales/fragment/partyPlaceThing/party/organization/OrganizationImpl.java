package org.venuspj.sales.fragment.partyPlaceThing.party.organization;

import org.venuspj.sales.fragment.description.party.organization.OrganizationDescription;
import org.venuspj.sales.fragment.partyPlaceThing.party.AbstractParty;
import org.venuspj.sales.fragment.partyPlaceThing.party.Party;

public class OrganizationImpl
        extends AbstractParty<Organization, OrganizationDescription>
        implements Party<Organization, OrganizationDescription>, Organization {
    public OrganizationImpl() {
        super();

    }

    public OrganizationImpl(OrganizationDescription description) {
        super(description);
    }

}
