package org.venuspj.sales.core.model.partnerManagement.customer;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class CustomerIdentifier extends AbstractEntityIdentifier<Customer, CustomerIdentifier, Long> {

    CustomerIdentifier(Long value) {
        super(Customer.class, value);

    }

    public CustomerIdentifier() {
        super(Customer.class);

    }

    public static CustomerIdentifier of(Long value) {
        return new CustomerIdentifier(value);
    }

}
