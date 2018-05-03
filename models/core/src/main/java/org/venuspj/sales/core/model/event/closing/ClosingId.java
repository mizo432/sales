package org.venuspj.sales.core.model.event.closing;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.utils.Objects2;

/**
 * Created by mizoguchi on 2017/07/07.
 */
public class ClosingId {
    private ChargeGroupIdentifier chargeGroupIdentifier;
    private RecordYearMonth recordYearMonth;


    ClosingId() {
    }

    public ClosingId(ChargeGroupIdentifier aChargeGroupIdentifier, RecordYearMonth aRecordYearMonth) {
        chargeGroupIdentifier = aChargeGroupIdentifier;
        recordYearMonth = aRecordYearMonth;
    }

    public boolean isPresent() {
        return chargeGroupIdentifier.isPresent() || recordYearMonth.isPresent();

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("chargeGroupIdentifier", chargeGroupIdentifier)
                .add("recordYearMonth", recordYearMonth)
                .omitNullValues()
                .toString();
    }
}
