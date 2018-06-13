package org.venuspj.sales.application.contract.additionalDetail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailMock;

public class PostingAdditionalDetailOutputPortMockTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostingAdditionalDetailOutputPortMockTest.class);
    @Test
    public void toString1() throws Exception {
        PostingAdditionalDetailOutputPort target = new PostingAdditionalDetailOutputPortMock();
        String actual = target.toString();
        LOGGER.debug("actual" + actual);

    }

    @Test
    public void toString2() throws Exception {
        PostingAdditionalDetailOutputPort target = new PostingAdditionalDetailOutputPortMock();
        target.setAdditionalDetail(AdditionalDetailMock.createDummy());
        String actual = target.toString();
        LOGGER.debug("actual" + actual);
    }
}
