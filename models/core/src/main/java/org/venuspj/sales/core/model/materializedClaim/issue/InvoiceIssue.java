package org.venuspj.sales.core.model.materializedClaim.issue;

import org.venuspj.sales.core.fundamentals.event.Event;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }

}
