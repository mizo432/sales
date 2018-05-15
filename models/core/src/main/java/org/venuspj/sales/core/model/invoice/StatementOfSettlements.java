package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.account.model.Tax;
import org.venuspj.sales.core.model.invoice.details.InvoiceDetails;


/**
 * 請求書/支払い通知書
 */
public interface StatementOfSettlements {

    OutputFormat outputFormat();

    InvoiceIdentifier invoiceId();

    RecordYearMonth recordYearMonth();

    InvoiceDetails getInvoiceDetails();

    PayableAmount payableAmount();

    ReceivableAmount receivableAmount();

    Tax tax();

}
