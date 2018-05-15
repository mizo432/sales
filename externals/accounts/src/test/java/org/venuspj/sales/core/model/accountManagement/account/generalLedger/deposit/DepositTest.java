package org.venuspj.sales.core.model.accountManagement.account.generalLedger.deposit;


import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.Tax;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class DepositTest {

    private static Logger LOGGER = getLogger();

    @Test
    public void toStringValue(){
        Deposit target = createDummyDeposit();
        LOGGER.debug(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void tax(){
        Deposit target = createDummyDeposit();
        assertThat(target).isNotNull();
        assertThat(target.getTax()).isNotNull().isEqualTo(Tax.empty());
    }

    private Deposit createDummyDeposit() {
        return new Deposit.DepositBuilder()
                .withNumber(new AccountNumber(10))
                    .withAmount(Amount.yen(10))
                    .build();
    }

}