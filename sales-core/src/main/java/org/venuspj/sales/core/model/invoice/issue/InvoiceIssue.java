package org.venuspj.sales.core.model.invoice.issue;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.utils.Objects2;

/**
 * 請求書発行
 */
public class InvoiceIssue {

    private InvoiceIssueId invoiceIssueId;
    private InvoiceNo invoiceNo;
    private Event event;
    private PdfFileInf pdfFileInf;

    public InvoiceIssue(InvoiceIssueId anInvoiceIssueId, InvoiceNo anInvoiceNo,
                        Event anEvent, PdfFileInf aPdfFileInf) {
        invoiceIssueId = anInvoiceIssueId;
        invoiceNo = anInvoiceNo;
        event = anEvent;
        pdfFileInf = aPdfFileInf;
    }

    InvoiceIssue() {
    }


    public InvoiceIssueId invoiceIssueId() {
        return invoiceIssueId;
    }

    public InvoiceNo invoiceNo() {
        return invoiceNo;
    }

    public Event event() {
        return event;
    }

    public PdfFileInf pdfFileInf() {
        return pdfFileInf;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("invoiceIssueId", invoiceIssueId)
                .add("invoiceNo", invoiceNo)
                .add("event", event)
                .add("pdfFileInf", pdfFileInf)
                .omitNullValues()
                .toString();
    }

}
