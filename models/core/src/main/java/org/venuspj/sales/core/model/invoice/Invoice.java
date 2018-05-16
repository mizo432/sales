package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.account.model.Tax;
import org.venuspj.sales.core.model.invoice.details.InvoiceDetails;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;


/**
 * 請求書エンティティ
 */
public class Invoice implements StatementOfSettlements {

    private RecordDate recordDate;

    /**
     * 請求先グループ
     */
    private ChargeGroupIdentifier chargeGroupIdentifier;

    /**
     * 請求Id
     */
    private InvoiceIdentifier invoiceIdentifier;

    /**
     * 請求書明細
     */
    private InvoiceDetails invoiceDetails = InvoiceDetails.create();

    /**
     * 合計金額
     */
    private Amount totalAmount;

    /**
     * 合計金額
     */
    private Amount totalTaxAmount;

    private OutputFormat outputFormat;

    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    public Invoice() {
    }

    public Invoice(InvoiceIdentifier invoiceIdentifier,
                   ChargeGroupIdentifier chargeGroupIdentifier,
                   InvoiceDetails invoiceDetails,
                   RecordDate recordDate,
                   OutputFormat outputFormat,
                   Amount totalAmount) {

        this.chargeGroupIdentifier = chargeGroupIdentifier;
        this.invoiceIdentifier = invoiceIdentifier;
        this.invoiceDetails.addAll(invoiceDetails);
        this.recordDate = recordDate;
        this.outputFormat = outputFormat;
        this.totalAmount = totalAmount;

    }

    public InvoiceIdentifier getInvoiceIdentifier() {
        return invoiceIdentifier;
    }

    public ChargeGroupIdentifier getChargeGroupIdentifier() {
        return chargeGroupIdentifier;

    }


    @Override
    public RecordYearMonth getRecordYearMonth() {
        return recordDate.getRecordYearMonth();
    }

    public RecordDate recordDate() {
        return recordDate;

    }

    public InvoiceDetails getInvoiceDetails() {
        return invoiceDetails;

    }

    @Override
    public PayableAmount getPayableAmount() {
        return null;

    }

    @Override
    public ReceivableAmount getReceivableAmount() {
        return null;

    }

    public Tax tax() {
        return invoiceDetails.tax();

    }

    public Amount totalAmount() {
        return totalAmount;

    }

    public boolean existsSaleDetails() {
        return invoiceDetails.existsSaleDetails();

    }

}
