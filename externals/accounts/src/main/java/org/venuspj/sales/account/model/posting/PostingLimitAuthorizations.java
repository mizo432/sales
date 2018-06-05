package org.venuspj.sales.account.model.posting;

import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.values.ListValue;
import org.venuspj.sales.core.fundamentals.whenOccurred.WhenOccurred;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class PostingLimitAuthorizations implements ListValue<PostingLimitAuthorization> {

    private List<PostingLimitAuthorization> list = newArrayList();

    public Boolean isAuthorizedToPostAmountOnDate(Amount amount, WhenOccurred whenOccurred) {
        return list.stream()
                .allMatch(postingLimitAuthorization -> postingLimitAuthorization.isAuthorizedToPostAmountOnDate(amount, whenOccurred));

    }

    @Override
    public List<PostingLimitAuthorization> asList() {
        return list;

    }
}
