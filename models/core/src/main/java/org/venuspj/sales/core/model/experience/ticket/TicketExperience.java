package org.venuspj.sales.core.model.experience.ticket;

import org.venuspj.sales.core.model.experience.AbstractExperience;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;

public class TicketExperience extends AbstractExperience {
    public TicketExperience(){

    }

    public TicketExperience(ChargeGroupId chargeGroupId) {
        super(chargeGroupId);
    }
}
