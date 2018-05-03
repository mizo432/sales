package org.venuspj.sales.core.model.experience;

import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

public interface Experience {

    ChargeGroupIdentifier getChargeGroupIdentifier();
    RecordDate getRecordDate();

    Fee getFee();

}
