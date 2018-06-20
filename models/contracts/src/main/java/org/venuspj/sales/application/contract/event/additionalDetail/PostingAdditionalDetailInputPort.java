package org.venuspj.sales.application.contract.event.additionalDetail;

import org.venuspj.cleanArchitecture.useCase.UseCaseInputPort;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.user.UserIdentifier;

/**
 */
public interface PostingAdditionalDetailInputPort extends UseCaseInputPort {

    UserIdentifier operationUserId();

    ChargeGroupIdentifier chargeGroupIdentifier();

    Event moment();
}
