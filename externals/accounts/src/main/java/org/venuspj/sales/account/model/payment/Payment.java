package org.venuspj.sales.account.model.payment;

public abstract class Payment {

    private PaymentAmount paymentAmount;

    public Payment() {

    }

    Payment(PaymentAmount paymentAmount) {
        this.paymentAmount = paymentAmount;

    }

    /**
     * 支払いを受けとる.
     */
    abstract void acceptPayment();

    /**
     * 支払いを承認する.
     */
    abstract void authorizePayment();

    /**
     * 釣銭を計算する.
     */
    abstract void calcChangeDue();

    /**
     * 支払い者による支払い合計金額を計算する.
     */
    abstract void calcTotalPayment();

    public PaymentAmount getPaymentAmount() {
        return this.paymentAmount;
    }
}
