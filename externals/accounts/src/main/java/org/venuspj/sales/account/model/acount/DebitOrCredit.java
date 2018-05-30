package org.venuspj.sales.account.model.acount;

public enum DebitOrCredit {
    DEBIT("借方"), CREDIT("貸方"), UNKNOWN("未定");

    private final String lavel;

    public String getLavel() {
        return lavel;
    }

    DebitOrCredit(String lavel) {
        this.lavel = lavel;
    }

}
