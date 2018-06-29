package org.venuspj.sales.account.model.payment;

import org.venuspj.sales.core.fundamentals.amount.Amount;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class Payments {
    private List<Payment> list = newArrayList();

    public Payments() {

    }

    Payments(Collection<Payment> list) {
        this.list.addAll(list);


    }

    public Amount calcTotalPayment() {
        Long total = list.stream()
                .mapToLong(payment -> payment.getPaymentAmount().asLong())
                .sum();

        return Amount.yens(total);

    }
}
