package org.venuspj.sales.core.model.invoice.details.saleDetails;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class InvoiceDetailFromSaleDetails {
    List<InvoiceDetailFromSaleDetail> list = newArrayList();

    public InvoiceDetailFromSaleDetails(List<InvoiceDetailFromSaleDetail> aList) {
        list.addAll(list);
    }

    InvoiceDetailFromSaleDetails() {

    }

    public static InvoiceDetailFromSaleDetails empty() {
        return new InvoiceDetailFromSaleDetails();
    }
}
