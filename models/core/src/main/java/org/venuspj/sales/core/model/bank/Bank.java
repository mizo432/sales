package org.venuspj.sales.core.model.bank;

import org.venuspj.ddd.model.entity.AbstractEntity;

/**
 * 金融機関.
 * OrganizationRole
 */
public class Bank extends AbstractEntity<Bank, BankIdentifier> {
    public Bank() {

    }

    Bank(BankIdentifier bankIdentifier) {
        super(bankIdentifier);

    }

}
