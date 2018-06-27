package org.venuspj.sales.core.model.bank;

import org.venuspj.ddd.model.entity.AbstractIntegerEntityIdentifier;

public class BankIdentifier extends AbstractIntegerEntityIdentifier<Bank, BankIdentifier> {
    public BankIdentifier() {
        super(Bank.class);
    }

    protected BankIdentifier(Integer value) {
        super(Bank.class, value);

    }

}
