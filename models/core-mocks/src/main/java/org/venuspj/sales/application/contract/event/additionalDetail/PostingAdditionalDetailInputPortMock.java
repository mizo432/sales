package org.venuspj.sales.application.contract.event.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdMock;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.user.UserIdentifier;
import org.venuspj.sales.core.model.user.UserIdMock;

public class PostingAdditionalDetailInputPortMock implements PostingAdditionalDetailInputPort {
    UserIdentifier operationUserIdentifier;
    ChargeGroupIdentifier chargeGroupIdentifier;
    Event moment;

    public PostingAdditionalDetailInputPortMock(UserIdentifier anOperationUserIdentifier, ChargeGroupIdentifier aChargeGroupIdentifier, Event aMoment) {
        operationUserIdentifier = anOperationUserIdentifier;
        chargeGroupIdentifier = aChargeGroupIdentifier;
        moment = aMoment;

    }

    @Override
    public UserIdentifier operationUserId() {
        return operationUserIdentifier;
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
        UserIdentifier userIdentifier = UserIdMock.DEFAULT_USER_ID;
        ChargeGroupIdentifier chargeGroupIdentifier = ChargeGroupIdMock.DEFAULT_CHARGE_GROUP_ID;
        Event event = EventProvider.newEvent();
        return new PostingAdditionalDetailInputPortMock(userIdentifier, chargeGroupIdentifier, event);

    }
}
