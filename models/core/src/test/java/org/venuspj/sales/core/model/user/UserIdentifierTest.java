package org.venuspj.sales.core.model.user;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class UserIdentifierTest {

    @Test
    public void test01() {
        UserIdentifier target = new UserIdentifier();
        assertThat(target).isNotNull();
    }

}