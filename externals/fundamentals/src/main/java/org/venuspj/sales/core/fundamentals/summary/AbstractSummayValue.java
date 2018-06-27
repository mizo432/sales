package org.venuspj.sales.core.fundamentals.summary;

import org.venuspj.ddd.model.value.AbstractStringValue;

public class AbstractSummayValue<ASV extends AbstractSummayValue<ASV>> extends AbstractStringValue<ASV> implements SummaryValue<ASV> {

    @Override
    public Summary asSummary() {
        return Summary.of(value);
    }


}
