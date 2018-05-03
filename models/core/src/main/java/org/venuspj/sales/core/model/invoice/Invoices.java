package org.venuspj.sales.core.model.invoice;


import org.venuspj.sales.core.fundamentals.listValue.ListValue;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.utils.Objects2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.venuspj.sales.utils.collect.Lists2.newArrayList;

/**
 * 請求書エンティティ
 */
public class Invoices implements ListValue<Invoice> {

    List<Invoice> list = newArrayList();

    public List<Invoice> getList() {
        return list;
    }

    Invoices() {

    }

    public Invoices(List<Invoice> aList) {
        list.addAll(aList);
    }

    public Iterator<Invoice> iterator() {
        return list.iterator();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean hasNewerInvoice(InvoiceIdentifier invoiceIdentifier) {
        return list.stream().sorted(new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return o1.recordDate().compareTo(o2.recordDate());
            }
        }.reversed()).map(iv -> iv.invoiceId()).collect(Collectors.toList()).indexOf(invoiceIdentifier) > 0;
    }

    public RecordDate getOldestRecordDate() {
        RecordDate resultDate = null;
        for (Invoice invoice : list) {
            if (resultDate == null) {
                resultDate = invoice.recordDate();
            } else {
                if (resultDate.isAfter(invoice.recordDate())) {
                    resultDate = invoice.recordDate();
                }
            }
        }
        return resultDate;
    }

    public RecordDate getNewestRecordDate() {
        RecordDate resultDate = null;
        for (Invoice invoice : list) {
            if (resultDate == null) {
                resultDate = invoice.recordDate();
            } else {
                if (resultDate.isBefore(invoice.recordDate())) {
                    resultDate = invoice.recordDate();
                }
            }
        }
        return resultDate;
    }

    @Override
    public List<Invoice> asList() {
        return Collections.unmodifiableList(list);
    }
}
