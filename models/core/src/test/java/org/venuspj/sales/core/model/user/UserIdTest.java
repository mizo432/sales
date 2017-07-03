package org.venuspj.sales.core.model.user;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class UserIdTest {

    @Test
    public void test01() {
        UserId target = new UserId();
        assertThat(target).isNotNull();
    }

}