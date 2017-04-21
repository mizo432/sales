package learning;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class LearningTest {
    private Logger LOGGER = LoggerFactory.getLogger(LearningTest.class);

    @Test
    public void test01(){
        AtomicReference<LocalDateTime> target = new AtomicReference<>(LocalDateTime.of(2017, 1, 2, 3, 4, 5, 7));
        assertThat(target).isNotNull();
        LOGGER.debug("target:" + target);
        LOGGER.debug("target.get():" + target.get());

    }
}
