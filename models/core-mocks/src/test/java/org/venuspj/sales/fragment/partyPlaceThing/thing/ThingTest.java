package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class ThingTest {
    @Test
    public void test() {
        Thing target = ThingMock.createMock(ThingMock.ThingMockType.SIMPLE);
        System.out.println(toStringHelper(target).defaultConfig().toString());

    }
}
