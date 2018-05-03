package org.venuspj.sales.core.model.experience.activity;

import org.venuspj.sales.core.fundamentals.recordDate.RecordDate;
import org.venuspj.sales.core.model.experience.AbstractExperience;
import org.venuspj.sales.core.model.experience.ApplicationDate;
import org.venuspj.sales.core.model.experience.ExperienceDate;
import org.venuspj.sales.core.model.experience.Fee;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

public class ActivityExperience extends AbstractExperience {

    public ActivityExperience() {

    }

    public ActivityExperience(ChargeGroupIdentifier chargeGroupIdentifier,
                              ApplicationDate applicationDate,
                              ExperienceDate experienceDate) {
        super(chargeGroupIdentifier, applicationDate, experienceDate);
    }

    @Override
    public RecordDate getRecordDate() {
        return null;
    }

    @Override
    public Fee getFee() {
        return null;
    }
}
