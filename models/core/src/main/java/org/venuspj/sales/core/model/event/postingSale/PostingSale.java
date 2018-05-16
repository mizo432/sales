package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.account.model.Tax;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroup;

/**
 * アクティビティ売上を記帳する
 */
public class PostingSale {

    private ChargeGroup chargeGroup;

    private Event event;

    // 借方
    /**
     * 売上(EC)
     */
    private Sale sale;

    private Tax tax;

    // 貸方
    /**
     * 売掛金
     */
    private Receivable receivable;

    /**
     * 預り金
     */
    private Deposit deposit;


    public void post() {

    }

}
