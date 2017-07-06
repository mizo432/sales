package org.venuspj.sales.core.model.event.closing;

import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.utils.Objects2;

/**
 * Created by mizoguchi on 2017/07/07.
 */
public class ClosingId {
    private ChargeGroupId chargeGroupId;
    private RecordYearMonth recordYearMonth;


    ClosingId() {
    }

    public ClosingId(ChargeGroupId aChargeGroupId, RecordYearMonth aRecordYearMonth) {
        chargeGroupId = aChargeGroupId;
        recordYearMonth = aRecordYearMonth;
    }

    public boolean isPresent() {
        return chargeGroupId.isPresent() || recordYearMonth.isPresent();

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("chargeGroupId", chargeGroupId)
                .add("recordYearMonth", recordYearMonth)
                .omitNullValues()
                .toString();
    }
}
