package org.venuspj.sales.core.model.materializedClaim.invoice;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class InvoiceIds {

    private List<InvoiceIdentifier> list = newArrayList();

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
