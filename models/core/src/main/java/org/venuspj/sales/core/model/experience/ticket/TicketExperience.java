package org.venuspj.sales.core.model.experience.ticket;

import org.venuspj.sales.core.model.experience.AbstractExperience;
import org.venuspj.sales.core.model.experience.ApplicationDate;
import org.venuspj.sales.core.model.experience.ExperienceDate;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

public class TicketExperience extends AbstractExperience {
    public TicketExperience() {

    }

    public TicketExperience(ChargeGroupIdentifier chargeGroupIdentifier,
                            ApplicationDate applicationDate,
                            ExperienceDate experienceDate) {
        super(chargeGroupIdentifier, applicationDate, experienceDate);
    }
}
