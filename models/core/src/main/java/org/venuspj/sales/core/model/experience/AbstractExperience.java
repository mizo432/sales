package org.venuspj.sales.core.model.experience;

import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

public abstract class AbstractExperience implements Experience {

    private ChargeGroupIdentifier chargeGroupIdentifier;
    private ApplicationDate applicationDate;
    private ExperienceDate experienceDate;
//    private BaseId baseId;

    protected AbstractExperience() {

    }

    protected AbstractExperience(ChargeGroupIdentifier chargeGroupIdentifier,
                                 ApplicationDate applicationDate,
                                 ExperienceDate experienceDate) {
        this.chargeGroupIdentifier = chargeGroupIdentifier;
        this.applicationDate = applicationDate;
        this.experienceDate = experienceDate;

    }

    @Override
    public ChargeGroupIdentifier getChargeGroupIdentifier() {
        return chargeGroupIdentifier;

    }


}
