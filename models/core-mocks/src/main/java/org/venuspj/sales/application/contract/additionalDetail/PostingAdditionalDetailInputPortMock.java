package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdMock;
import org.venuspj.sales.core.model.user.UserId;
import org.venuspj.sales.core.model.user.UserIdMock;
import org.venuspj.sales.utils.Objects2;

public class PostingAdditionalDetailInputPortMock implements PostingAdditionalDetailInputPort {
    UserId operationUserId;
    ChargeGroupId chargeGroupId;
    Event moment;

    public PostingAdditionalDetailInputPortMock(UserId anOperationUserId, ChargeGroupId aChargeGroupId, Event aMoment) {
        operationUserId = anOperationUserId;
        chargeGroupId = aChargeGroupId;
        moment = aMoment;

    }

    @Override
    public UserId operationUserId() {
        return operationUserId;
    }

    @Override
    public ChargeGroupId chargeGroupId() {
        return chargeGroupId;
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
                .add("chargeGroupId", chargeGroupId)
                .add("moment", moment)
                .omitNullValues()
                .toString();
    }

    public static PostingAdditionalDetailInputPort createMock() {
        UserId userId = UserIdMock.DEFAULT_USER_ID;
        ChargeGroupId chargeGroupId = ChargeGroupIdMock.DEFAULT_CHARGE_GROUP_ID;
        Event moment = new Event(RecordDateTimeProvider.currentRecordDateTime(), userId);
        return new PostingAdditionalDetailInputPortMock(userId, chargeGroupId, moment);

    }
}
