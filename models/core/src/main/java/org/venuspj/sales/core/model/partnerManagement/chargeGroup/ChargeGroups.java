package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.core.model.partnerManagement.customer.CustomerIdentifiers;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import static org.venuspj.util.collect.Maps2.newHashMap;

public class ChargeGroups {
    Map<ChargeGroupIdentifier, ChargeGroup> map = newHashMap();

    public ChargeGroups() {

    }

    ChargeGroups(Collection<ChargeGroup> collection) {
        map.putAll(collection
                .stream()
                .collect(Collectors
                        .toMap(ChargeGroup::getChargeGroupIdentifier, chargeGroup1 -> chargeGroup1)));

    }

    public CustomerIdentifiers getPartnerIdentifiers() {
        return CustomerIdentifiers.of(map
                .values()
                .stream()
                .map(ChargeGroup::getCustomerIdentifier)
                .collect(Collectors.toSet()));

    }

}
