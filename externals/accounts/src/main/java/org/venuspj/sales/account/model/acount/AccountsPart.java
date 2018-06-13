package org.venuspj.sales.account.model.acount;

import org.venuspj.sales.core.fundamentals.amount.AmountValue;
import org.venuspj.sales.core.fundamentals.number.Number;

/**
 * 会計のエレメント
 * <pre>部相当する</pre>
 */
public enum AccountsPart {
    /**
     * 資産
     */
    ASSETS("資産", AccountsStatement.BALANCE_SHEETS, 0, DebitOrCredit.DEBIT),
    /**
     * 負債
     */
    LIABILITIES("負債", AccountsStatement.BALANCE_SHEETS, 1, DebitOrCredit.CREDIT),
    /**
     * 純資産
     */
    SHAREHOLDERS_EQUITY("純資産", AccountsStatement.BALANCE_SHEETS, 3, DebitOrCredit.CREDIT),
    /**
     * 収益
     */
    REVENUE("収益", AccountsStatement.PROFIT_AND_LOSS_STATEMENTS, 4, DebitOrCredit.CREDIT),
    /**
     * 費用
     */
    EXPENSE("費用", AccountsStatement.PROFIT_AND_LOSS_STATEMENTS, 5, DebitOrCredit.DEBIT),
    UNKNOWN("未定", AccountsStatement.UNKNOWN, 7, DebitOrCredit.DEBIT);

    private final AccountPartName partName;
    private final AccountsStatement accountStatement;
    private final Number orderNumber;
    private final DebitOrCredit sideOnPlus;

    public AccountPartName getPartName() {
        return partName;
    }

    public AccountsStatement getAccountStatement() {
        return accountStatement;
    }

    public Number getOrderNumber() {
        return orderNumber;
    }

    public DebitOrCredit getSideOnPlus() {
        return sideOnPlus;
    }

    AccountsPart(String partName, AccountsStatement accountStatement, Integer orderNo, DebitOrCredit sideOnPlus) {
        this.partName = AccountPartName.of(partName);
        this.accountStatement = accountStatement;
        orderNumber = new Number(orderNo);
        this.sideOnPlus = sideOnPlus;
    }

    public DebitOrCredit whichDebitOrCredit(AmountValue amountValue) {
        if (sideOnPlus == DebitOrCredit.CREDIT)
            return amountValue.asAmount().isPositive() ? DebitOrCredit.CREDIT : DebitOrCredit.DEBIT;

        if (sideOnPlus == DebitOrCredit.DEBIT)
            return amountValue.asAmount().isPositive() ? DebitOrCredit.DEBIT : DebitOrCredit.CREDIT;

        return DebitOrCredit.UNKNOWN;
    }
}
