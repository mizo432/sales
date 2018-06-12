package org.venuspj.sales.core.model.partnerManagement.customer;


import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class CustomerIdentifiers implements ListValue<CustomerIdentifier> {
    private final List<CustomerIdentifier> list = newArrayList();

    public CustomerIdentifiers() {

    }

    CustomerIdentifiers(Collection<CustomerIdentifier> collection) {
        list.addAll(collection);

    }

    public static CustomerIdentifiers of(Collection<CustomerIdentifier> collection) {
        return new CustomerIdentifiers(collection);

    }

    @Override
    public List<CustomerIdentifier> asList() {
        return list;
    }

    @Override
    public Iterator<CustomerIdentifier> iterator() {
        return list.iterator();
    }

    @Override
    public List<CustomerIdentifier> getValue() {
        return list;
    }
}
