package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.name.Name;

public enum TaxClassification {
    INNER_TAX("内税"),
    OUTER_TAX("外税"),
    UNTAXABLE("非課税"),
    NON_TAXABLE("不課税"),
    EXCLUDES("対象外科目"),
    UNKNOWN("未定");

    private final Name name;

    TaxClassification(String name) {
        this.name = Name.of(name);
    }

    public boolean isOuterTax() {
        return this == OUTER_TAX;

    }

}
