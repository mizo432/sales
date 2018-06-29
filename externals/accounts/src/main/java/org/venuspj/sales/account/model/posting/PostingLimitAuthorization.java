package org.venuspj.sales.account.model.posting;

import com.google.common.collect.Range;
import org.venuspj.sales.core.fundamentals.amount.Amount;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTime;
import org.venuspj.sales.core.fundamentals.whenOccurred.WhenOccurred;

public class PostingLimitAuthorization {
    private Amount limit = Amount.yens(Long.MAX_VALUE);
    private Range<RecordDateTime> interval = Range.all();

    public PostingLimitAuthorization() {

    }

    PostingLimitAuthorization(Amount limit, Range<RecordDateTime> interval) {
        this.interval = interval;
        this.limit = limit;

    }

    public boolean isAuthorizedToPostAmountOnDate(Amount amount, WhenOccurred whenOccurred) {
        if (!isWithinInterval(whenOccurred)) return false;
        return amount.isSmallOrEqual(limit);
    }

    private boolean isWithinInterval(WhenOccurred whenOccurred) {
        return interval.contains(whenOccurred.asRecordDateTime());

    }

    public static PostingLimitAuthorization of(Amount limit, Range<RecordDateTime> interval) {
        return new PostingLimitAuthorization(limit, interval);
    }

}
