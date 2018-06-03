package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.sale.*;

public interface SaleToCustomer {

    SaleIdentifier getSaleIdentifier();

    SaleCaption getSaleCaption();

    TaxRate getTaxRate();

    Tax getTax();

    SaleAmount getSaleAmount();

    ChargeGroupIdentifier getChargeGroupIdentifier();

    SalesDeposit salesDeposit();

}
