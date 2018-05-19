package org.venuspj.sales.account.model;

public class AccountNumber {
    private Integer value;

    AccountNumber() {

    }

    public AccountNumber(Integer value) {
        this.value = value;

    }

    public Integer asInteger() {
        return value;

    }

}
