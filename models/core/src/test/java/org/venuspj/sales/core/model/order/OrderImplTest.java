package org.venuspj.sales.core.model.order;


import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.sales.core.fundamentals.event.EventProvider;

import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class OrderImplTest {

    private static Logger LOGGER = getLogger();

    @Test
    public void test() {
        Order target = new OrderImpl();
        LOGGER.debug(toStringHelper(target).defaultConfig().toString());

    }

    @Test
    public void test2() {
        Order target = OrderImpl.builder().build();
        LOGGER.debug(toStringHelper(target).defaultConfig().toString());

    }
    @Test
    public void test3() {
        Order target = OrderImpl.builder()
                .withEvent(EventProvider.newEvent())
                .withEntityIdentifier(OrderIdentifier.of(1))
                .build();

        LOGGER.debug(toStringHelper(target).defaultConfig().toString());

    }

}