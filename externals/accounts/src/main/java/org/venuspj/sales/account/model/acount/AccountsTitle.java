package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.name.Name;

/**
 * 勘定科目
 */
public enum AccountsTitle {
    ADVANCE(AccountsPart.LIABILITIES, "前受金"),
    DEPOSIT(AccountsPart.LIABILITIES, "預り金"),
    SALE(AccountsPart.REVENUE, "売上"),
    TRADE_ACCOUNTS_RECEIVABLE(AccountsPart.ASSETS, "売掛金"),
    BANK_ACCOUNT(AccountsPart.ASSETS, "銀行口座"), UNKNOWN(AccountsPart.UNKNOWN, "未定");

    private final AccountsPart accountsPart;
    private final Name accountsName;

    public AccountsPart getAccountsPart() {
        return accountsPart;
    }

    public Name getAccountsName() {
        return accountsName;
    }

    AccountsTitle(AccountsPart accountsPart, String title) {
        this.accountsPart = accountsPart;
        accountsName = Name.of(title);
    }
}
