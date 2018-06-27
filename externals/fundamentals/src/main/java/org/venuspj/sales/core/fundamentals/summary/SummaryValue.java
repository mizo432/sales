package org.venuspj.sales.core.fundamentals.summary;

import org.venuspj.ddd.model.value.StringValue;

public interface SummaryValue<SV extends SummaryValue<SV>> extends StringValue<SV> {
    Summary asSummary();
}
