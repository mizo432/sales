package org.venuspj.sales.core.model.accountManagement.account.generalLedger.assetAccount;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.sales.account.model.acount.AccountAmount;
import org.venuspj.sales.account.model.acount.AccountNumber;
import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.account.model.acount.TaxClassification;
import org.venuspj.sales.account.model.generalLedger.assetAccount.TradeAccountsReceivable;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class TradeAccountsReceivableTest {
    private static Logger LOGGER = getLogger();

    @Test
    public void toStringValue() {
        TradeAccountsReceivable target = createDummyDeposit();
        LOGGER.debug(toStringHelper(target).defaultConfig().toString());

    }

    @Test
    public void tax() {
        TradeAccountsReceivable target = createDummyDeposit();
        assertThat(target).isNotNull();
        assertThat(target.getTax()).isNotNull().isEqualTo(Tax.empty());
        assertThat(target.getTaxClassification()).isNotNull().isEqualTo(TaxClassification.EXCLUDES);

    }

    private TradeAccountsReceivable createDummyDeposit() {
        return new TradeAccountsReceivable.TradeAccountsReceivableBuilder()
                .withAccountNumber(AccountNumber.of(10))
                .withAccountAmount(AccountAmount.yen(10L))
                .build();
    }

}