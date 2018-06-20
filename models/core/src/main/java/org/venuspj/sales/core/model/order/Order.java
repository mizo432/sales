package org.venuspj.sales.core.model.order;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.sales.core.fundamentals.event.Event;

public interface Order extends Entity<Order, OrderIdentifier> {
    Event getEvent();

}
