package org.venuspj.sales.core.model.bank.branch;

import org.venuspj.ddd.model.entity.AbstractIntegerEntityIdentifier;

public class BranchIdentifier extends AbstractIntegerEntityIdentifier<Branch, BranchIdentifier> {
    public BranchIdentifier() {
        super(Branch.class);
    }

    protected BranchIdentifier(Integer value) {
        super(Branch.class, value);
    }
}
