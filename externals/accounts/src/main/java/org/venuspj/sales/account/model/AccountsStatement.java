package org.venuspj.sales.account.model;

import org.venuspj.sales.core.fundamentals.titleName.TitleName;

/**
 * 決算報告洋式
 */
public enum AccountsStatement {
    PROFIT_AND_LOSS_STATEMENTS("損益計算書"),
    BALANCE_SHEETS("貸借対照表");
    TitleName statementName;

    AccountsStatement(String aStatementName) {
        statementName = new TitleName(aStatementName);
    }
}
