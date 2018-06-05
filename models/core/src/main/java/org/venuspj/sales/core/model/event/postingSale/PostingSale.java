package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.account.fundamentals.whenNoticed.WhenNoticed;
import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.whenOccurred.WhenOccurred;
import org.venuspj.sales.core.model.event.accounting.AccountingEvent;
import org.venuspj.sales.core.model.event.accounting.EventType;
import org.venuspj.sales.core.model.event.accounting.ServiceAgreement;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroup;

/**
 * アクティビティ売上を記帳する
 */
public class PostingSale extends AccountingEvent {

    private ChargeGroup chargeGroup;

    private Event moment;

    private ServiceAgreement serviceAgreement;


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

    protected PostingSale(WhenOccurred whenOccurred, WhenNoticed whenNoticed) {
        super(EventType.POSTING_SALE, whenOccurred, whenNoticed);
    }

    public void post() {
        serviceAgreement
                .getPostingRule(getEventType(), getWhenNoticed())
                .process(this);
    }


}
