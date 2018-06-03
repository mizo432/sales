package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.invoice.details.StatementDetails;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.statementOfSettlements.StatementOfSettlements;


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
    private StatementDetails statementDetails = StatementDetails.create();

    /**
     * 合計金額
     */
    private Amount totalAmount;

    private OutputFormat outputFormat;

    @Override
    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    public Invoice() {
    }

    Invoice(InvoiceIdentifier invoiceIdentifier,
            ChargeGroupIdentifier chargeGroupIdentifier,
            StatementDetails statementDetails,
            RecordDate recordDate,
            Amount totalAmount) {

        this.chargeGroupIdentifier = chargeGroupIdentifier;
        this.invoiceIdentifier = invoiceIdentifier;
        this.statementDetails = statementDetails;
        this.recordDate = recordDate;
        this.outputFormat = OutputFormat.INVOICE;
        this.totalAmount = totalAmount;

    }

    @Override
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

    @Override
    public StatementDetails getStatementDetails() {
        return statementDetails;

    }

    @Override
    public PayableAmount getPayableAmount() {
        return null;

    }

    @Override
    public ReceivableAmount getReceivableAmount() {
        return null;

    }

    @Override
    public Tax tax() {
        return statementDetails.totalTax();

    }

    public Amount totalAmount() {
        return statementDetails.totalAmount();

    }

    public boolean existsSaleDetails() {
        return statementDetails.existsSaleDetails();

    }

}
