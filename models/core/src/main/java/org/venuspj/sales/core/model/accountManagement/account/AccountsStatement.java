package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.titleName.TitleName;

public enum AccountsStatement {
    PROFIT_AND_LOSS_STATEMENTS("損益計算書"),
    BALANCE_SHEETS("貸借対照表");
    TitleName statementName;

    AccountsStatement(String aStatementName) {
        statementName = new TitleName(aStatementName);
    }
}
