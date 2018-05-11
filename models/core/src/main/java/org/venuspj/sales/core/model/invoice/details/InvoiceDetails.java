package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.values.ListValue;
import org.venuspj.sales.core.model.accountManagement.account.Tax;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class InvoiceDetails implements ListValue<InvoiceDetail> {
    List<InvoiceDetail> list = newArrayList();

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

        for (InvoiceDetail invoiceDetail : list) {
            resultTax += invoiceDetail.getTax().asInteger();
        }

        return Tax.yens(resultTax);

    }
}
