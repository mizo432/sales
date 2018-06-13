package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.titleName.TitleName;

/**
 * 決算報告洋式
 */
public enum AccountsStatement {
    PROFIT_AND_LOSS_STATEMENTS("損益計算書"),
    BALANCE_SHEETS("貸借対照表"), UNKNOWN("未定");
    private TitleName statementName;

    public TitleName getStatementName() {
        return statementName;
    }

    AccountsStatement(String aStatementName) {
        statementName = TitleName.of(aStatementName);

    }
}
