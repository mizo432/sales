package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.model.accountManagement.account.Tax;
import org.venuspj.sales.core.model.invoice.InvoiceIdentifier;
import org.venuspj.sales.core.model.invoice.details.saleDetails.InvoiceDetailFromSaleDetails;

public class InvoiceDetail {
    private InvoiceIdentifier invoiceIdentifier;
    private DetailSource detailSource;
    private Summary summary;
    private Amount bullingAmount;
    private RecordDate recordDate;
    private Amount deposit;
    private Tax tax;
    private InvoiceDetailFromSaleDetails invoiceDetailFromSaleDetails = InvoiceDetailFromSaleDetails.empty();

    InvoiceDetail() {

    }

    public InvoiceDetail(InvoiceIdentifier invoiceIdentifier,
                         DetailSource detailSource,
                         Summary summary,
                         Amount bullingAmount,
                         RecordDate recordDate,
                         Amount deposit,
                         Tax tax,
                         InvoiceDetailFromSaleDetails invoiceDetailFromSaleDetails) {
        this.invoiceIdentifier = invoiceIdentifier;
        this.detailSource = detailSource;
        this.summary = summary;
        this.bullingAmount = bullingAmount;
        this.recordDate = recordDate;
        this.deposit = deposit;
        this.tax = tax;
        this.invoiceDetailFromSaleDetails = invoiceDetailFromSaleDetails;

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

    public Tax getTax() {
        return tax;
    }
}
