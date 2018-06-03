package org.venuspj.sales.core.model.event.postingSale;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.sales.account.model.acount.*;
import org.venuspj.sales.core.model.event.postingSale.Sale.SaleBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class SaleToCustomerTest {

    private static Logger LOGGER = getLogger();

    @Test
    public void toStringValue() {
        Sale target = createDummySale();
        LOGGER.debug(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void tax() {
        Sale target = createDummySale();
        assertThat(target).isNotNull();
        assertThat(target.getTax()).isNotNull().isEqualTo(Tax.yens(80L));
    }

    @Test
    public void getSubTotal1() {
        Sale target = createDummySale();
        assertThat(target).isNotNull();
        assertThat(target.getSubTotal()).isNotNull().isEqualTo(AccountAmount.yen(1080L));
    }

    @Test
    public void getSubTotal2() {
        Sale target = new SaleBuilder()
                .withNumber(AccountNumber.of(10))
                .withAccountAmount(AccountAmount.yen(1000L))
                .withAccountsTitle(AccountsTitle.SALE)
                .withAccountsSubTitle(new AccountsSubTitle("aaaa"))
                .withTax(Tax.yens(70L))
                .withTaxClassification(TaxClassification.INNER_TAX)
                .build();
        assertThat(target)
                .isNotNull();
        assertThat(target.getSubTotal())
                .isNotNull()
                .isEqualTo(AccountAmount.yen(1000L));
    }

    private Sale createDummySale() {
        return new SaleBuilder()
                .withNumber(AccountNumber.of(10))
                .withAccountAmount(AccountAmount.yen(1000L))
                .withAccountsTitle(AccountsTitle.SALE)
                .withAccountsSubTitle(new AccountsSubTitle("aaaa"))
                .withTax(Tax.yens(80L))
                .withTaxClassification(TaxClassification.OUTER_TAX)
                .build();
    }

}