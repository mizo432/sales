package org.venuspj.sales.core.model.bank;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.sales.fragment.partyPlaceThing.party.organization.Organization;

public class Bank extends AbstractEntity<Bank, BankIdentifier> implements Organization {
    Bank() {

    }

    Bank(BankIdentifier bankIdentifier) {
        super(bankIdentifier);

    }

}
