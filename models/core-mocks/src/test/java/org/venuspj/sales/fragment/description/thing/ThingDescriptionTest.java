package org.venuspj.sales.fragment.description.thing;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ThingDescriptionTest {
    @Test
    public void createMock() {
        ThingDescription target = ThingDescriptionMock.createMock(ThingDescriptionMock.ThingDescriptionMockType.SIMPLE);

        System.out.println(toStringHelper(target).defaultConfig().toString());

    }
}
