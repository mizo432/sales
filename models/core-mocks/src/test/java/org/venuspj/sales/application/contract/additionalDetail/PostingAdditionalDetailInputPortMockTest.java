package org.venuspj.sales.application.contract.additionalDetail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostingAdditionalDetailInputPortMockTest {
    Logger LOGGER = LoggerFactory.getLogger(PostingAdditionalDetailInputPortMockTest.class);
    @Test
    public void toString01() throws Exception {
        PostingAdditionalDetailInputPort target = PostingAdditionalDetailInputPortMock.createMock();
        String actual = target.toString();
        LOGGER.debug("actual:" + actual);
    }
}
