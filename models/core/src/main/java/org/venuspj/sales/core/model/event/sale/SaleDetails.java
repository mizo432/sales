package org.venuspj.sales.core.model.event.sale;

import org.venuspj.sales.core.fundamentals.values.ListValue;
import org.venuspj.sales.core.model.event.sale.detail.SaleDetail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SaleDetails implements ListValue<SaleDetail> {
    List<SaleDetail> list = new ArrayList<>();

    SaleDetails(Collection<SaleDetail> anyCollection) {
        list.addAll(anyCollection);

    }

    @Override
    public List<SaleDetail> asList() {
        return Collections.unmodifiableList(list);
    }
}
