package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.model.event.postingSale.Tax;
import org.venuspj.sales.core.model.invoice.InvoiceIdentifier;
import org.venuspj.sales.core.model.invoice.details.saleDetails.InvoiceDetailFromSaleDetails;

public class InvoiceDetail {
    InvoiceIdentifier invoiceIdentifier;
    DetailSource detailSource;
    Summary summary;
    Amount bullingAmount;
    RecordDate recordDate;
    Amount deposit;
    Tax tax;
    InvoiceDetailFromSaleDetails invoiceDetailFromSaleDetails = InvoiceDetailFromSaleDetails.empty();

    InvoiceDetail() {

    }

    public InvoiceDetail(InvoiceIdentifier anInvoiceIdentifier,
                         DetailSource aDetailSource,
                         Summary aSummary,
                         Amount aBullingAmount,
                         RecordDate aRecordDate,
                         Amount anDeposit,
                         Tax tax,
                         InvoiceDetailFromSaleDetails anInvoiceDetailFromSaleDetails) {
        invoiceIdentifier = anInvoiceIdentifier;
        detailSource = aDetailSource;
        summary = aSummary;
        bullingAmount = aBullingAmount;
        recordDate = aRecordDate;
        deposit = anDeposit;
        tax = tax;
        invoiceDetailFromSaleDetails = anInvoiceDetailFromSaleDetails;

    }


    /**
     * 請求金額を取得する
     * <pre>
     *     (税込) 正の値の場合請求 負の値の場合支払
     * </pre>
     * @return 請求金額
     */
    public Amount bullingAmount() {
        return bullingAmount;

    }

    public Amount getTotalAmount() {
        return Amount.yenZero().plus(bullingAmount).plus(tax).minus(deposit);
    }

    public Tax getTax() {
        return tax;
    }
}
