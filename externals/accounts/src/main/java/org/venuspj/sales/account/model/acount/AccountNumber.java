package org.venuspj.sales.account.model.acount;

public class AccountNumber {
    private Integer value;

    public AccountNumber() {

    }

    public AccountNumber(Integer value) {
        this.value = value;

    }

    public Integer asInteger() {
        return value;

    }

    public static AccountNumber of(Integer value) {
        return new AccountNumber(value);
    }

}
