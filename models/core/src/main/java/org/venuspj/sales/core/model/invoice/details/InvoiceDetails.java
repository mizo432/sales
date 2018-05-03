package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.listValue.ListValue;
import org.venuspj.sales.core.model.event.postingSale.Tax;
import org.venuspj.sales.utils.collect.Lists2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InvoiceDetails implements ListValue<InvoiceDetail> {
    List<InvoiceDetail> list = Lists2.newArrayList();

    public <I extends InvoiceDetail> InvoiceDetails(Collection<I> list) {
        list.addAll(list);
    }

    InvoiceDetails() {

    }

    public static InvoiceDetails create() {
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

    public void addAll(InvoiceDetails invoiceDetails) {
        list.addAll(invoiceDetails.asList());

    }

    @Override
    public List<InvoiceDetail> asList() {
        return Collections.unmodifiableList(list);

    }

    public Tax tax() {
        Integer resultTax = 0;

        for (InvoiceDetail invoiceDetail : list)
            resultTax = resultTax + invoiceDetail.getTax().asInteger();

        return Tax.yen(resultTax);

    }
}
