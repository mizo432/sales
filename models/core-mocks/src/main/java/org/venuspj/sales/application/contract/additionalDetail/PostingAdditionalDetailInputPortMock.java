package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdMock;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.user.UserId;
import org.venuspj.sales.core.model.user.UserIdMock;
import org.venuspj.sales.utils.Objects2;

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
    public ChargeGroupIdentifier chargeGroupId() {
        return chargeGroupIdentifier;
    }

    @Override
    public Event moment() {
        return moment;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("operationUserId", operationUserId)
                .add("chargeGroupIdentifier", chargeGroupIdentifier)
                .add("moment", moment)
                .omitNullValues()
                .toString();
    }

    public static PostingAdditionalDetailInputPort createMock() {
        UserId userId = UserIdMock.DEFAULT_USER_ID;
        ChargeGroupIdentifier chargeGroupIdentifier = ChargeGroupIdMock.DEFAULT_CHARGE_GROUP_ID;
        Event moment = new Event(RecordDateTimeProvider.currentRecordDateTime(), userId);
        return new PostingAdditionalDetailInputPortMock(userId, chargeGroupIdentifier, moment);

    }
}
