package org.venuspj.sales.core.model.invoice;

import org.venuspj.sales.utils.Objects2;

public class InvoiceId {
    private Integer value;

    public InvoiceId(Integer value) {
        this.value = value;
    }

    InvoiceId() {
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public static InvoiceId of(String value) {
        return of(Integer.valueOf(value));
    }

    public static InvoiceId of(Integer value) {
        return new InvoiceId(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceId invoiceId = (InvoiceId) o;

        return value != null ? value.equals(invoiceId.value) : invoiceId.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
