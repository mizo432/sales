package org.venuspj.sales.core.model.order;


import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityBuilder;
import org.venuspj.sales.core.fundamentals.event.Event;

import static org.venuspj.util.objects2.Objects2.nonNull;

/**
 * 受注
 * #MomentInterval
 */
public class OrderImpl extends AbstractEntity<Order> implements Order, Entity<Order> {
    Event event = new Event();

    public OrderImpl() {

    }

    OrderImpl(OrderIdentifier orderIdentifier, Event event) {
        super(orderIdentifier);
        this.event = event;

    }

    public Event getEvent() {
        return event;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder extends EntityBuilder<Order, OrderBuilder> {
        private Event event = new Event();


        @Override
        protected void apply(Order vo, OrderBuilder builder) {
            builder.withEntityIdentifier(vo.getIdentifier());
            builder.withEvent(vo.getEvent());

        }

        public OrderBuilder withEvent(Event event) {
            if (nonNull(event))
                addConfigurator(builder -> builder.event = event);

            return getThis();

        }

        @Override
        protected OrderImpl createValueObject() {
            return new OrderImpl((OrderIdentifier) identifier, event);
        }

        @Override
        protected OrderBuilder getThis() {
            return this;
        }

        @Override
        protected OrderBuilder newInstance() {
            return new OrderBuilder();
        }
    }

}
