package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.sale.SaleCategory;
import org.venuspj.sales.core.model.sale.SaleId;
import org.venuspj.sales.utils.Objects2;

public class DetailSource {
    SaleId saleId = SaleId.empty();
    AdditionalDetailId additionalDetailId = AdditionalDetailId.empty();
    SaleCategory saleCategory = SaleCategory.NON_ASSIGNED;
    InvoiceDetailSourceClassification invoiceDetailSourceClassification = InvoiceDetailSourceClassification.NON_ASSIGNED;

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("saleId",saleId)
                .add("additionalDetailId",additionalDetailId)
                .add("saleCategory",saleCategory)
                .add("invoiceDetailSourceClassification",invoiceDetailSourceClassification)
                .omitNullValues()
                .toString();
    }
}
