package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.invoice.details.InvoiceDetails;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroup;
import org.venuspj.sales.utils.Objects2;


/**
 * 請求書エンティティ
 */
public class Invoice {
    /** 請求Id */
    private InvoiceId invoiceId;

    /** 計上年月 */
    private RecordYearMonth recordYearMonth;

    /** 計上日 */
    private RecordDate recordDate;

    /** 請求書明細 */
    private InvoiceDetails invoiceDetails = InvoiceDetails.emptyInvoiceDetails();

    /** 合計金額 */
    private Amount totalAmount;

    /** 合計金額 */
    private Amount totalTaxAmount;

    private OutputFormat outputFormat;

    public OutputFormat outputFormat() {
        return outputFormat;
    }

    public Invoice() {
    }

    @Deprecated
    public Invoice(InvoiceId invoiceId, ChargeGroup chargeGroup, Amount totalAmount, InvoiceDetails invoiceDetails,
                   OutputFormat outputFormat, RecordDate recordDate) {
    }

    public InvoiceId invoiceId() {
        return invoiceId;
    }

    public RecordDate recordDate() {
        return recordDate;
    }

    public InvoiceDetails getInvoiceDetails() {
        return invoiceDetails;
    }

    public Amount totalAmount() {
        return totalAmount;
    }

    public boolean existsSaleDetails() {
        return invoiceDetails.existsSaleDetails();
    }

    public Amount taxTotalAmount() {
        return totalTaxAmount;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("invoiceId",invoiceId)
                .add("recordYearMonth",recordYearMonth)
                .add("recordDate",recordDate)
                .add("totalAmount",totalAmount)
                .add("totalTaxAmount",totalTaxAmount)
                .add("invoiceDetails",invoiceDetails)
                .add("outputFormat",outputFormat)
                .omitNullValues()
                .toString();
    }

}
