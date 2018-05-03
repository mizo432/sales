package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.utils.collect.Lists2;

import java.util.List;

public class InvoiceIds {

    private List<InvoiceIdentifier> list = Lists2.newArrayList();

    public InvoiceIds(List<InvoiceIdentifier> list) {
        this.list.addAll(list);

    }

    public List<InvoiceIdentifier> getList() {
        return list;
    }

    public int size() {
        return list.size();
    }

}
