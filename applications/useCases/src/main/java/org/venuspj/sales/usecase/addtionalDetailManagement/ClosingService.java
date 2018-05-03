package org.venuspj.sales.usecase.addtionalDetailManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.event.closing.Closing;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;

/**
 */
public class ClosingService {
    ClosingRepository closingRepository;

    @Autowired
    public ClosingService(ClosingRepository aClosingRepository) {
        closingRepository = aClosingRepository;
    }

    public void reopenIfClosed(ChargeGroupIdentifier chargeGroupIdentifier, Event aMoment) {
        ClosingCredential closingCredential = ClosingCredential.of(chargeGroupIdentifier,aMoment);
        Closing closing = closingRepository.findOne(closingCredential);
        if(closing.isPresent() && closing.closingStatus().isClosed())
            closingRepository.store(closing.reopen());
    }
}
