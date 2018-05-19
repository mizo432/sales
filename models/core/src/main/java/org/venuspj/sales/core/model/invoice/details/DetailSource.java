package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.event.postingSale.SaleCategory;
import org.venuspj.sales.core.model.event.sale.SaleId;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class DetailSource {
    SaleId saleId = SaleId.empty();
    AdditionalDetailId additionalDetailId = AdditionalDetailId.empty();
    SaleCategory saleCategory = SaleCategory.NON_ASSIGNED;
    InvoiceDetailSourceClassification invoiceDetailSourceClassification = InvoiceDetailSourceClassification.NON_ASSIGNED;

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
