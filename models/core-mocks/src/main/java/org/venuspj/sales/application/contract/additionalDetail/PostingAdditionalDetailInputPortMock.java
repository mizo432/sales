package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdMock;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.user.UserId;
import org.venuspj.sales.core.model.user.UserIdMock;

public class PostingAdditionalDetailInputPortMock implements PostingAdditionalDetailInputPort {
    UserId operationUserId;
    ChargeGroupIdentifier chargeGroupIdentifier;
    Event moment;

    public PostingAdditionalDetailInputPortMock(UserId anOperationUserId, ChargeGroupIdentifier aChargeGroupIdentifier, Event aMoment) {
        operationUserId = anOperationUserId;
        chargeGroupIdentifier = aChargeGroupIdentifier;
        moment = aMoment;

    }

    @Override
    public UserId operationUserId() {
        return operationUserId;
    }

    @Override
    public ChargeGroupIdentifier chargeGroupIdentifier() {
        return chargeGroupIdentifier;
    }

    @Override
    public Event moment() {
        return moment;
    }


    public static PostingAdditionalDetailInputPort createMock() {
        UserId userId = UserIdMock.DEFAULT_USER_ID;
        ChargeGroupIdentifier chargeGroupIdentifier = ChargeGroupIdMock.DEFAULT_CHARGE_GROUP_ID;
        Event event = EventProvider.newEvent();
        return new PostingAdditionalDetailInputPortMock(userId, chargeGroupIdentifier, event);

    }
}
