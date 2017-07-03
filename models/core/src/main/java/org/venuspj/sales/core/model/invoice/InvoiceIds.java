package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.utils.Lists2;

import java.util.List;

public class InvoiceIds {

    private List<InvoiceId> list = Lists2.newArrayList();

    public InvoiceIds(List<InvoiceId> list) {
        this.list.addAll(list);

    }

    public List<InvoiceId> getList() {
        return list;
    }

    public int size() {
        return list.size();
    }

}
