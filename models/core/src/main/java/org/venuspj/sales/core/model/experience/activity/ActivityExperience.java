package org.venuspj.sales.core.model.experience.activity;

import org.venuspj.sales.core.model.experience.AbstractExperience;
import org.venuspj.sales.core.model.experience.ApplicationDate;
import org.venuspj.sales.core.model.experience.ExperienceDate;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

public class ActivityExperience extends AbstractExperience {

    public ActivityExperience() {

    }

    public ActivityExperience(ChargeGroupId chargeGroupId,
                              ApplicationDate applicationDate,
                              ExperienceDate experienceDate) {
        super(chargeGroupId, applicationDate, experienceDate);
    }
}
