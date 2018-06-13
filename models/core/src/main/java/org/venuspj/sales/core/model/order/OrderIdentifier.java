package org.venuspj.sales.core.model.order;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class OrderIdentifier extends AbstractEntityIdentifier<Order> {

    private Integer value;

    public OrderIdentifier() {
        super(Order.class);
    }

    OrderIdentifier(Integer value) {
        super(Order.class);
        this.value = value;

    }

    public static OrderIdentifier of(Integer value) {
        return new OrderIdentifier(value);
    }


    @Override
    public boolean equals(Object o) {
        return o instanceof OrderIdentifier && sameValueAs((OrderIdentifier) o);
    }

    public boolean sameValueAs(OrderIdentifier other) {
        return super.equals(other) && equal(value, other.value);

    }

    @Override
    public int hashCode() {
        return hash(kind, value);

    }

    @Override
    public boolean sameValueAs(EntityIdentifier<Order> other) {
        return false;
    }

}
