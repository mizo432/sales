package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.sale.SaleCategory;
import org.venuspj.sales.core.model.sale.SaleIdentifier;

public class DetailSource {
    SaleIdentifier saleIdentifier = SaleIdentifier.create();
    AdditionalDetailId additionalDetailId = AdditionalDetailId.empty();
    SaleCategory saleCategory = SaleCategory.NON_ASSIGNED;
    InvoiceDetailSourceClassification invoiceDetailSourceClassification = InvoiceDetailSourceClassification.NON_ASSIGNED;

}
