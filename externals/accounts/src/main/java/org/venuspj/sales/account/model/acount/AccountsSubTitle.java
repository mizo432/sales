package org.venuspj.sales.account.model.acount;

/**
 * 勘定補助科目
 */
public class AccountsSubTitle {
    private String value;

    AccountsSubTitle() {
    }

    public AccountsSubTitle(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
