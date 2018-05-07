package org.venuspj.sales.core.model.partnerManagement.partner;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class PartnerIdentifiers {
    private final List<PartnerIdentifier> list = newArrayList();

    public PartnerIdentifiers(Collection<PartnerIdentifier> collection) {
        list.addAll(collection);

    }
}
