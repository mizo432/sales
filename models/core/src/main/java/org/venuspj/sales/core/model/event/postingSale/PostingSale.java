package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.core.model.accountManagement.account.Tax;

/**
 * アクティビティ売上を記帳する
 */
public class PostingSale {

    private ChargeGroup chargeGroup;

    private Moment moment;

    private Custody custody;

    // 借方
    /** 売上(EC) */
    private Sale sale;

    private Tax tax;

    // 貸方
    /** 売掛金 */
    private Receivable receivable;

    /** 預り金 */
    private Deposit deposit;


    public void post(){

    }

}
