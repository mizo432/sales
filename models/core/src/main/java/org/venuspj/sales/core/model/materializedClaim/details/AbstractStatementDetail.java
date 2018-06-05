package org.venuspj.sales.core.model.materializedClaim.details;

import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.model.materializedClaim.invoice.InvoiceIdentifier;
import org.venuspj.sales.core.model.statementOfSettlements.StatementAmount;

public class AbstractStatementDetail implements StatementDetail {
    private InvoiceIdentifier invoiceIdentifier;
    private DetailSource detailSource;
    private Summary summary;
    private Amount bullingAmount;
    private RecordDate recordDate;
    private Amount deposit;
    private Tax tax;

    AbstractStatementDetail() {

    }

    public AbstractStatementDetail(InvoiceIdentifier invoiceIdentifier,
                                   DetailSource detailSource,
                                   Summary summary,
                                   Amount bullingAmount,
                                   RecordDate recordDate,
                                   Amount deposit,
                                   Tax tax) {
        this.invoiceIdentifier = invoiceIdentifier;
        this.detailSource = detailSource;
        this.summary = summary;
        this.bullingAmount = bullingAmount;
        this.recordDate = recordDate;
        this.deposit = deposit;
        this.tax = tax;

    }


    /**
     * 請求金額を取得する
     * <pre>
     *     (税込) 正の値の場合請求 負の値の場合支払
     * </pre>
     *
     * @return 請求金額
     */
    public Amount bullingAmount() {
        return bullingAmount;

    }

    public Amount getTotalAmount() {
        return Amount.yenZero().plus(bullingAmount).plus(tax.asAmount()).minus(deposit);
    }

    @Override
    public StatementAmount getTax() {
        return StatementAmount.of(tax);
    }

    @Override
    public StatementAmount getAmount() {
        return null;
    }

    public InvoiceIdentifier getInvoiceIdentifier() {
        return invoiceIdentifier;
    }

    public DetailSource getDetailSource() {
        return detailSource;
    }

    public Summary getSummary() {
        return summary;
    }

    public Amount getBullingAmount() {
        return bullingAmount;
    }

    public RecordDate getRecordDate() {
        return recordDate;
    }

    public Amount getDeposit() {
        return deposit;
    }
}
