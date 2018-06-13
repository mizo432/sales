package org.venuspj.sales.core.model.partnerManagement.customer;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.value.LongValue;

import static org.venuspj.util.objects2.Objects2.*;

public class CustomerIdentifier extends AbstractEntityIdentifier<Customer> {

    private Long value;

    public CustomerIdentifier(Long value) {
        this.value = value;

    }

    public CustomerIdentifier() {

    }

    public boolean isPresent() {
        return nonNull(value);
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        return (obj instanceof EntityIdentifier) && sameValueAs((EntityIdentifier<Customer>) obj);
    }

    @Override
    public boolean sameValueAs(EntityIdentifier<Customer> other) {
        return other instanceof LongValue && equal(this.value, ((LongValue) other).asLong());

    }

    @Override
    public int hashCode() {
        return hash(value);

    }

    public boolean sameValueAs(CustomerIdentifier other) {
        return false;
    }

    public Long asLong() {
        return value;
    }


}
