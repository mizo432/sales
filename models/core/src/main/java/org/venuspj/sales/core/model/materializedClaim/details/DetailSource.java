package org.venuspj.sales.core.model.materializedClaim.details;

import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.event.postingSale.SaleCategory;
import org.venuspj.sales.core.model.sale.SaleIdentifier;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class DetailSource {
    SaleIdentifier saleIdentifier = new SaleIdentifier();
    AdditionalDetailId additionalDetailId = AdditionalDetailId.empty();
    SaleCategory saleCategory = SaleCategory.NON_ASSIGNED;
    InvoiceDetailSourceClassification invoiceDetailSourceClassification = InvoiceDetailSourceClassification.NON_ASSIGNED;

    public DetailSource() {

    }

    public DetailSource(SaleIdentifier saleIdentifier,
                        AdditionalDetailId additionalDetailId,
                        SaleCategory saleCategory,
                        InvoiceDetailSourceClassification invoiceDetailSourceClassification) {
        this.saleIdentifier = saleIdentifier;
        this.additionalDetailId = additionalDetailId;
        this.saleCategory = saleCategory;
        this.invoiceDetailSourceClassification = invoiceDetailSourceClassification;

    }

    public SaleIdentifier getSaleIdentifier() {
        return saleIdentifier;
    }

    public AdditionalDetailId getAdditionalDetailId() {
        return additionalDetailId;
    }

    public SaleCategory getSaleCategory() {
        return saleCategory;
    }

    public InvoiceDetailSourceClassification getInvoiceDetailSourceClassification() {
        return invoiceDetailSourceClassification;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
