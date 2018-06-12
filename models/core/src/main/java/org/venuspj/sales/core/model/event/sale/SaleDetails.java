package org.venuspj.sales.core.model.event.sale;

import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.sales.core.model.event.sale.detail.SaleDetail;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class SaleDetails implements ListValue<SaleDetail> {

    List<SaleDetail> list = newArrayList();

    SaleDetails(Collection<SaleDetail> anyCollection) {
        list.addAll(anyCollection);

    }

    @Override
    public List<SaleDetail> asList() {
        return Collections.unmodifiableList(list);

    }

    @Override
    public Iterator<SaleDetail> iterator() {
        return list.iterator();
    }

    @Override
    public List<SaleDetail> getValue() {
        return list;
    }

}
