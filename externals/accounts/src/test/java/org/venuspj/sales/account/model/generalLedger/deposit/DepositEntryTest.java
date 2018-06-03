package org.venuspj.sales.account.model.generalLedger.deposit;


import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.sales.account.model.acount.AccountAmount;
import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.Tax;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class DepositEntryTest {

    private static Logger LOGGER = getLogger();

    @Test
    public void toStringValue() {
        DepositEntry target = createDummyDeposit();
        LOGGER.debug(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void tax() {
        DepositEntry target = createDummyDeposit();
        assertThat(target).isNotNull();
        assertThat(target.getTax()).isNotNull().isEqualTo(Tax.empty());
    }

    private DepositEntry createDummyDeposit() {
        return new DepositEntry.DepositBuilder()
                .withNumber(AccountNumber.of(10))
                .withAccountAmount(AccountAmount.yen(10L))
                .build();
    }

}