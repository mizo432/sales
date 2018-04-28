package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.model.invoice.Invoice;
import org.venuspj.sales.utils.collect.Lists2;

import java.util.List;

public class InvoiceDetails {
    List<Invoice> list = Lists2.newArrayList();

    public InvoiceDetails(List<Invoice> alist) {
        list.addAll(alist);
    }

    InvoiceDetails() {

    }

    public static InvoiceDetails emptyInvoiceDetails() {
        return new InvoiceDetails();
    }

    public boolean existsSaleDetails() {
        // TODO atdk
        return false;
    }

    public Amount getTotalAmountAndTax() {
        // TODO atdk
        return null;
    }
}
