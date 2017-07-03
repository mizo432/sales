package org.venuspj.sales.core.model.invoice.details.saleDetails;

import org.venuspj.sales.utils.Lists2;

import java.util.List;

public class InvoiceDetailFromSaleDetails {
    List<InvoiceDetailFromSaleDetail> list = Lists2.newArrayList();

    public InvoiceDetailFromSaleDetails(List<InvoiceDetailFromSaleDetail> aList) {
        list.addAll(list);
    }

    InvoiceDetailFromSaleDetails() {

    }

    public static InvoiceDetailFromSaleDetails empty() {
        return new InvoiceDetailFromSaleDetails();
    }
}
