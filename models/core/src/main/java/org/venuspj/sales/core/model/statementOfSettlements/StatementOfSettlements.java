package org.venuspj.sales.core.model.statementOfSettlements;

import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.invoice.InvoiceIdentifier;
import org.venuspj.sales.core.model.invoice.OutputFormat;
import org.venuspj.sales.core.model.invoice.PayableAmount;
import org.venuspj.sales.core.model.invoice.ReceivableAmount;
import org.venuspj.sales.core.model.invoice.details.StatementDetails;


/**
 * 請求書/支払い通知書
 */
public interface StatementOfSettlements {

    OutputFormat getOutputFormat();

    InvoiceIdentifier getInvoiceIdentifier();

    RecordYearMonth getRecordYearMonth();

    StatementDetails getStatementDetails();

    PayableAmount getPayableAmount();

    ReceivableAmount getReceivableAmount();

    Tax tax();

}
