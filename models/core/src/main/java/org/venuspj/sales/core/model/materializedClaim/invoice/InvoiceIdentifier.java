package org.venuspj.sales.core.model.materializedClaim.invoice;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class InvoiceIdentifier {
    private Integer value;

    public InvoiceIdentifier(Integer value) {
        this.value = value;
    }

    InvoiceIdentifier() {
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }

    public static InvoiceIdentifier of(String value) {
        return of(Integer.valueOf(value));
    }

    public static InvoiceIdentifier of(Integer value) {
        return new InvoiceIdentifier(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceIdentifier invoiceIdentifier = (InvoiceIdentifier) o;

        return value != null ? value.equals(invoiceIdentifier.value) : invoiceIdentifier.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
