package org.venuspj.sales.fragment.description.party.organization;

import org.venuspj.sales.fragment.description.party.PartyDescription;
import org.venuspj.sales.fragment.partyPlaceThing.party.organization.Organization;
import org.venuspj.util.builder.ObjectBuilder;

public interface OrganizationDescription extends PartyDescription<Organization, OrganizationDescription> {

    class OrganizationDescriptionBuilder extends
            ObjectBuilder<OrganizationDescription, OrganizationDescriptionBuilder> {

        @Override
        protected void apply(OrganizationDescription vo, OrganizationDescriptionBuilder builder) {

        }

        @Override
        protected OrganizationDescription createValueObject() {
            return new OrganizationDescriptionImpl();
        }

        @Override
        protected OrganizationDescriptionBuilder getThis() {
            return this;
        }

        @Override
        protected OrganizationDescriptionBuilder newInstance() {
            return new OrganizationDescriptionBuilder();
        }
    }

}
