package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.account.model.Tax;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

public interface Sale {

    SaleIdentifier getSaleIdentifier();

    SaleCaption getSaleCaption();

    TaxRate getTaxRate();


    Tax getTax();

    SaleAmount getSaleAmount();

    ChargeGroupIdentifier getChargeGroupIdentifier();

    SalesDeposit salesDeposit();

}
