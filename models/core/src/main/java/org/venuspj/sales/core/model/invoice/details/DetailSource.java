package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.model.invoice.details.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.event.postingSale.SaleCategory;
import org.venuspj.sales.core.model.sale.SaleIdentifier;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class DetailSource {
    SaleIdentifier saleIdentifier = new SaleIdentifier();
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
