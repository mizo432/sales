package org.venuspj.sales.core.model.invoice.details;

import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.values.ListValue;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class StatementDetails implements ListValue<StatementDetail> {
    List<StatementDetail> list = newArrayList();

    public <I extends StatementDetail> StatementDetails(Collection<I> list) {
        list.addAll(list);

    }

    StatementDetails() {

    }

    public static StatementDetails create() {
        return new StatementDetails();
    }

    public boolean existsSaleDetails() {
        // TODO atdk
        return false;
    }

    public Amount getTotalAmountAndTax() {
        Long totalAmountAndTax = totalTax().asLong() + totalAmount().asLong();
        // TODO atdk
        return Amount.yen(totalAmountAndTax);
    }

    public Amount totalAmount() {
        Long totalAmount = 0L;

        for (StatementDetail statementDetail : list) {
            totalAmount += statementDetail.getAmount().asLong();
        }

        return Amount.yen(totalAmount);
    }

    @Override
    public List<StatementDetail> asList() {
        return Collections.unmodifiableList(list);

    }

    public Tax totalTax() {
        Long resultTax = 0L;

        for (StatementDetail statementDetail : list) {
            resultTax += statementDetail.getTax().asLong();
        }

        return Tax.yens(resultTax);

    }
}
