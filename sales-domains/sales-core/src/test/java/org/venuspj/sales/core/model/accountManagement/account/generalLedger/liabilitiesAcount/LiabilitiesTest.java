package org.venuspj.sales.core.model.accountManagement.account.generalLedger.liabilitiesAcount;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.Balance;

public class LiabilitiesTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LiabilitiesTest.class);
    @Test
    public void testToString() throws Exception {
        Liabilities target = new Liabilities(new AccountNumber(0), new Balance(0));
        String actual = target.toString();
        LOGGER.debug(actual);

    }
}
