package org.venuspj.sales.core.model.order;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class OrderIdentifier extends AbstractEntityIdentifier<Order, OrderIdentifier, Long> {

    public OrderIdentifier() {
        super(Order.class);
    }

    OrderIdentifier(Long value) {
        super(Order.class, value);

    }

    public static OrderIdentifier of(Long value) {
        return new OrderIdentifier(value);
    }

}
