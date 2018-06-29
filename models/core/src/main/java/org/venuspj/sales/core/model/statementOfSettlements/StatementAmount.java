package org.venuspj.sales.core.model.statementOfSettlements;

import org.venuspj.sales.core.fundamentals.amount.AbstractAmountValue;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.amount.AmountValue;

import static org.venuspj.util.objects2.Objects2.isNull;

public class StatementAmount extends AbstractAmountValue<StatementAmount> {

    public StatementAmount() {
        super();

    }

    private StatementAmount(Long value) {
        super(value);

    }

    public static StatementAmount yens(Long value) {
        return new StatementAmount(value);

    }

    public static StatementAmount zeroYen() {
        return yens(0L);

    }

    public static StatementAmount of(AmountValue<?> amountValue) {
        return new StatementAmount(amountValue.asLong());

    }

    @Override
    public Amount asAmount() {
        return isNull(value) || value > 0L ? Amount.yens(value) : Amount.yens(-value);

    }

    @Override
    public Long asLong() {
        if (isNull(value)) return 0L;
        return Math.abs(value);

    }
}
