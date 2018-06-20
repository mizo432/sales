package org.venuspj.sales.core.model.order;


import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.sales.core.fundamentals.event.Event;

import static org.venuspj.util.objects2.Objects2.nonNull;

/**
 * 受注
 * #MomentInterval
 */
public class OrderImpl extends AbstractEntity<Order, OrderIdentifier> implements Order {
    Event event = new Event();

    public OrderImpl() {

    }

    OrderImpl(OrderIdentifier orderIdentifier, Event event) {
        super(orderIdentifier);
        this.event = event;

    }

    @Override
    public Event getEvent() {
        return event;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder extends AbstractEntityBuilder<Order, OrderBuilder, OrderIdentifier> {
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
        protected Order createValueObject() {
            return new OrderImpl(identifier, event);

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
