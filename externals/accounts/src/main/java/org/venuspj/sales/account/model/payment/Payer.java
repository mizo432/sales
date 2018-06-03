package org.venuspj.sales.account.model.payment;

import org.venuspj.sales.core.fundamentals.amount.Amount;

public class Payer {
    private Payments payments;

    Payer(Payments payments){

        this.payments = payments;

    }

    Amount calcTotalPayment(){
       return payments.calcTotalPayment();
    }
}
