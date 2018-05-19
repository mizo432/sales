package org.venuspj.sales.core.model.event.postingSale;

import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeValue;
import org.venuspj.sales.core.model.accountManagement.account.Tax;
import org.venuspj.sales.core.model.event.accounting.AccountingEvent;
import org.venuspj.sales.core.model.event.accounting.EventType;
import org.venuspj.sales.core.model.event.accounting.ServiceAgreement;

/**
 * アクティビティ売上を記帳する
 */
public class PostingSale extends AccountingEvent {

    private ChargeGroup chargeGroup;

    private Moment moment;

    private Custody custody;

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

    protected PostingSale(RecordDateTimeValue whenOccurred, RecordDateTimeValue whenNoticed) {
        super(EventType.POSTING_SALE, whenOccurred, whenNoticed);
    }

    public void post() {
        serviceAgreement
                .getPostingRule(getEventType(), getWhenNoticed().asRecordDateTime())
                .process(this);
    }


}
