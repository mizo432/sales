package org.venuspj.sales.core.model.materializedClaim.details;

import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.sales.account.model.acount.Tax;
import org.venuspj.sales.core.fundamentals.amount.Amount;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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
        return Amount.yens(totalAmountAndTax);
    }

    public Amount totalAmount() {
        Long totalAmount = 0L;

        for (StatementDetail statementDetail : list) {
            totalAmount += statementDetail.getAmount().asLong();
        }

        return Amount.yens(totalAmount);
    }

    @Override
    public List<StatementDetail> asList() {
        return Collections.unmodifiableList(list);

    }

    @Override
    public Iterator<StatementDetail> iterator() {
        return list.iterator();
    }

    @Override
    public List<StatementDetail> getValue() {
        return list;
    }

    public Tax totalTax() {
        Long resultTax = 0L;

        for (StatementDetail statementDetail : list) {
            resultTax += statementDetail.getTax().asLong();
        }

        return Tax.yens(resultTax);

    }
}
