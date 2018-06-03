package org.venuspj.sales.core.model.statementOfSettlements;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

import static org.venuspj.util.objects2.Objects2.isNull;

public class StatementAmount implements AmountValue {
    private Long value;

    public StatementAmount() {

    }

    private StatementAmount(Long value) {
        this.value = value;

    }

    public static StatementAmount yens(Long value) {
        return new StatementAmount(value);

    }

    public static StatementAmount zeroYen() {
        return yens(0L);
    }

    public static StatementAmount of(AmountValue amountValue) {
        return new StatementAmount(amountValue.asLong());
    }

    @Override
    public Amount asAmount() {
        return isNull(value) || value > 0 ? Amount.yen(value) : Amount.yen(-value);
    }

    @Override
    public Long asLong() {
        return isNull(value) ? 0L : (value < 0 ? -value : value);
    }
}
