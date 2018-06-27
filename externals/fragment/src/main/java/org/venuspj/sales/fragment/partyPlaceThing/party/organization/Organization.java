package org.venuspj.sales.fragment.partyPlaceThing.party.organization;

import org.venuspj.sales.fragment.description.party.organization.OrganizationDescription;
import org.venuspj.sales.fragment.partyPlaceThing.party.Party;

public interface Organization extends Party<Organization,OrganizationDescription> {

    class OrganizationBuilder extends PartyPlaceThingBuilder<Organization,OrganizationBuilder,OrganizationDescription> {

        @Override
        protected Organization createValueObject() {
            return new OrganizationImpl(description);
        }

        @Override
        protected OrganizationBuilder getThis() {
            return null;
        }

        @Override
        protected OrganizationBuilder newInstance() {
            return null;
        }
    }
}
