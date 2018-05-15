package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.name.Name;

/**
 * 勘定科目
 */
public enum AccountsTitle {
    ADVANCE(AccountsPart.LIABILITIES, "前受金"),
    DEPOSIT(AccountsPart.LIABILITIES, "預り金"),
    SALE(AccountsPart.LIABILITIES, "売上"),
    TRADE_ACCOUNTS_RECEIVABLE(AccountsPart.ASSETS, "売掛金");

    private final AccountsPart accountsPart;
    private final Name accountsName;

    AccountsTitle(AccountsPart anAccountsPart, String aTitle) {
        accountsPart = anAccountsPart;
        accountsName = new Name(aTitle);
    }
}
