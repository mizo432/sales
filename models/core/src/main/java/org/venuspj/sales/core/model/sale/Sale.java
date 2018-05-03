package org.venuspj.sales.core.model.sale;

import org.venuspj.sales.core.model.event.postingSale.Tax;
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
