package org.venuspj.sales.core.model.experience.activity;

import org.venuspj.sales.core.model.experience.AbstractExperience;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

public class ActivityExperience extends AbstractExperience {

    public ActivityExperience() {

    }

    public ActivityExperience(ChargeGroupId chargeGroupId) {
        super(chargeGroupId);
    }
}
