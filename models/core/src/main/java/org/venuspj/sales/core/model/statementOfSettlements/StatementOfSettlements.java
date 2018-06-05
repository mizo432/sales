package org.venuspj.sales.core.model.statementOfSettlements;

import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.materializedClaim.invoice.InvoiceIdentifier;
import org.venuspj.sales.core.model.materializedClaim.OutputFormat;
import org.venuspj.sales.core.model.materializedClaim.paymentNotice.PayableAmount;
import org.venuspj.sales.core.model.materializedClaim.invoice.ReceivableAmount;
import org.venuspj.sales.core.model.materializedClaim.details.StatementDetails;


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
