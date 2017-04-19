package org.venuspj.sales.core.fundamentals.recordDatetime;


import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by kenichimizoguchi on 2017/04/19.
 */
public class RecordDatetimeTest {

    @Test
    public void asText() throws Exception {
        RecordDatetime target = new RecordDatetime(LocalDateTime.of(2017, 4, 1, 2, 3, 4, 5));
        assertThat(target.asText())
                .isNotNull()
                .isEqualTo("2017/04/01 02:03:04.000");
    }

}