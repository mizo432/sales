package org.venuspj.sales.externals;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by mizoguchi on 2017/05/21.
 */
public class Objects2Test {
    @Test
    public void equal() throws Exception {
        assertThat(
                Objects2.equal(Integer.valueOf(1), Integer.valueOf(1)))
                .isTrue();
    }

}