package org.venuspj.sales.core.model.invoice;


import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.utils.collect.Lists2;
import org.venuspj.sales.utils.Objects2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 請求書エンティティ
 */
public class Invoices  {

    List<Invoice> list = Lists2.newArrayList();

    public List<Invoice> getList() {
        return list;
    }

    Invoices() {

    }

    public Invoices(List<Invoice> aList) {
        list.addAll(aList);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    public Iterator<Invoice> iterator() {
        return list.iterator();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean hasNewerInvoice(InvoiceId invoiceId) {
        return list.stream().sorted(new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return o1.recordDate().compareTo(o2.recordDate());
            }
        }.reversed()).map(iv -> iv.invoiceId()).collect(Collectors.toList()).indexOf(invoiceId) > 0;
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

    public Amount getMinTaxTotalAmount() {
        Amount resultAmount = null;
        for (Invoice invoice : list) {
            final Amount taxAndTotalAmount = invoice.taxTotalAmount();
            if (resultAmount == null) {
                resultAmount = taxAndTotalAmount;
            } else {
                if (resultAmount.isMoreThan(taxAndTotalAmount)) {
                    resultAmount = taxAndTotalAmount;
                }
            }
        }
        return resultAmount;
    }

    public Amount getMaxTaxTotalAmount() {
        Amount resultAmount = null;
        for (Invoice invoice : list) {
            final Amount taxAndTotalAmount = invoice.taxTotalAmount();
            if (resultAmount == null) {
                resultAmount = taxAndTotalAmount;
            } else {
                if (resultAmount.isSmallThan(taxAndTotalAmount)) {
                    resultAmount = taxAndTotalAmount;
                }
            }
        }
        return resultAmount;
    }

    public Amount getTaxTotalAmount() {
        Amount resultAmount = Amount.yenZero();
        for (Invoice invoice : list) {
            resultAmount = resultAmount.plus(invoice.taxTotalAmount());
        }
        return resultAmount;
    }

    public Amount getTotalAmount() {
        Amount resultAmount = Amount.yenZero();
        for (Invoice invoice : list) {
            resultAmount = resultAmount.plus(invoice.totalAmount());
        }
        return resultAmount;
    }
}
