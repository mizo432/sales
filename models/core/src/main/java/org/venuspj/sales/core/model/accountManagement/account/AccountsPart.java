package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.core.fundamentals.number.Number;

public enum AccountsPart {
    ASSETS("資産", AccountsStatement.BALANCE_SHEETS, 0),
    LIABILITIES("負債", AccountsStatement.BALANCE_SHEETS, 1),
    SHAREHOLDERS_EQUITY("資本", AccountsStatement.BALANCE_SHEETS, 3),
    SALES("売上", AccountsStatement.PROFIT_AND_LOSS_STATEMENTS, 4),
    COST_OF_SALES("売上", AccountsStatement.PROFIT_AND_LOSS_STATEMENTS, 5),
    GENERAL_AND_ADMINISTRATIVE_EXPENSES("一般管理費", AccountsStatement.PROFIT_AND_LOSS_STATEMENTS, 6);

    private final AccountPartName partName;
    private final AccountsStatement accountStatement;
    private final Number orderNumber;

    AccountsPart(String aPartName, AccountsStatement anAccountStatement, Integer anOrderNo) {
        partName = new AccountPartName(aPartName);
        accountStatement = anAccountStatement;
        orderNumber = new Number(anOrderNo);
    }
}