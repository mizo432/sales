package org.venuspj.sales.core.model.bank.branch;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.sales.core.model.bank.Bank;
import org.venuspj.sales.fragment.description.party.organization.OrganizationDescription.OrganizationDescriptionBuilder;
import org.venuspj.sales.fragment.partyPlaceThing.party.organization.Organization;
import org.venuspj.sales.fragment.partyPlaceThing.party.organization.Organization.OrganizationBuilder;

public class Branch extends AbstractEntity<Branch, BranchIdentifier> {
    private Bank bank = new Bank();
    private Organization organization;

    {
        organization = new OrganizationBuilder()
                .withDescription(
                        new OrganizationDescriptionBuilder()
                                .build())
                .build();
    }

    public Branch() {
        super(new BranchIdentifier());
    }

    public Branch(BranchIdentifier branchIdentifier, Bank bank, Organization organization) {
        super(branchIdentifier);
        this.bank = bank;
        this.organization = organization;
    }

}
