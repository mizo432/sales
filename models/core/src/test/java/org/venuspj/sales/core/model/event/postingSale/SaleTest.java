package org.venuspj.sales.core.model.event.postingSale;

import org.junit.Test;
import org.slf4j.Logger;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.accountManagement.TaxClassification;
import org.venuspj.sales.core.model.accountManagement.account.AccountNumber;
import org.venuspj.sales.core.model.accountManagement.account.AccountsSubTitle;
import org.venuspj.sales.core.model.accountManagement.account.AccountsTitle;
import org.venuspj.sales.core.model.accountManagement.account.Tax;
import org.venuspj.sales.core.model.event.postingSale.Sale.SaleBuilder;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class SaleTest {

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
        assertThat(target.getTax()).isNotNull().isEqualTo(Tax.yens(80));
    }

    @Test
    public void getSubTotal1() {
        Sale target = createDummySale();
        assertThat(target).isNotNull();
        assertThat(target.getSubTotal()).isNotNull().isEqualTo(Amount.yen(1080));
    }

    @Test
    public void getSubTotal2() {
        Sale target = createDummySale();
        new SaleBuilder().witTax(Tax.yens(70)).witTaxClassification(TaxClassification.INNER_TAX).assignTo(target);
        assertThat(target)
                .isNotNull();
        assertThat(target.getSubTotal())
                .isNotNull()
                .isEqualTo(Amount.yen(1000));
    }

    private Sale createDummySale() {
        return new SaleBuilder()
                .withNumber(new AccountNumber(10))
                .withAmount(Amount.yen(1000))
                .withAccountsTitle(AccountsTitle.SALE)
                .withAccountsSubTitle(new AccountsSubTitle("aaaa"))
                .witTax(Tax.yens(80))
                .witTaxClassification(TaxClassification.OUTER_TAX)
                .build();
    }

}