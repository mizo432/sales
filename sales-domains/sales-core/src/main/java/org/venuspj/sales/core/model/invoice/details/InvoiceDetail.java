package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.model.invoice.InvoiceId;
import org.venuspj.sales.core.model.invoice.details.saleDetails.InvoiceDetailFromSaleDetails;
import org.venuspj.sales.utils.Objects2;

public class InvoiceDetail {
    InvoiceId invoiceId;
    DetailSource detailSource;
    Summary summary;
    Amount bullingAmount;
    RecordDate recordDate;
    Amount deposit;
    Amount tax;
    InvoiceDetailFromSaleDetails invoiceDetailFromSaleDetails = InvoiceDetailFromSaleDetails.empty();

    InvoiceDetail() {

    }

    public InvoiceDetail(InvoiceId anInvoiceId,
                         DetailSource aDetailSource,
                         Summary aSummary,
                         Amount aBullingAmount,
                         RecordDate aRecordDate,
                         Amount anDeposit,
                         Amount aTax,
                         InvoiceDetailFromSaleDetails anInvoiceDetailFromSaleDetails) {
        invoiceId = anInvoiceId;
        detailSource = aDetailSource;
        summary = aSummary;
        bullingAmount = aBullingAmount;
        recordDate = aRecordDate;
        deposit = anDeposit;
        tax = aTax;
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

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("invoiceId", invoiceId)
                .add("detailSource", detailSource)
                .add("summary", summary)
                .add("bullingAmount", bullingAmount)
                .add("recordDate", recordDate)
                .add("deposit", deposit)
                .add("tax", tax)
                .add("invoiceDetailFromSaleDetails", invoiceDetailFromSaleDetails)
                .omitNullValues()
                .toString();
    }

    public Amount getTotalAmount() {
        return Amount.zero().plus(bullingAmount).plus(tax).minus(deposit);
    }
}
