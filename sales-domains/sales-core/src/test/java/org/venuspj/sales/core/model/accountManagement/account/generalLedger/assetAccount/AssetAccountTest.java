package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.Balance;

public class AssetAccountTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AssetAccountTest.class);

    @Test
    public void testToString() {
        AssetAccount target = new AssetAccount(new AccountNumber(0), new Balance(0));
        String actual = target.toString();
        LOGGER.debug(actual);
    }
}
