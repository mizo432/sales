package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.cleanArchtecture.UseCaseInputPort;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.core.model.user.UserId;

/**
 */
public interface PostingAdditionalDetailInputPort extends UseCaseInputPort {

    UserId operationUserId();

    ChargeGroupId chargeGroupId();

    Event moment();
}
