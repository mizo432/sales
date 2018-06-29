package org.venuspj.sales.core.fundamentals.amount;

public interface AmountValue<A extends AmountValue<A>> {

    Amount asAmount();

    Long asLong();

}
