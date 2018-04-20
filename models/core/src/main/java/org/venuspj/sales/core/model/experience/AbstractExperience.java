package org.venuspj.sales.core.model.experience;

import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

public abstract class AbstractExperience implements Experience {
    private ChargeGroupId chargeGroupId;
    private ApplicationDate applicationDate;
    private ExperienceDate experienceDate;
//    private BaseId baseId;

    protected AbstractExperience() {

    }

    protected AbstractExperience(ChargeGroupId chargeGroupId,
                                 ApplicationDate applicationDate,
                                 ExperienceDate experienceDate) {
        this.chargeGroupId = chargeGroupId;


    }

    @Override
    public ChargeGroupId getChargeGroupId() {
        return chargeGroupId;

    }
}
