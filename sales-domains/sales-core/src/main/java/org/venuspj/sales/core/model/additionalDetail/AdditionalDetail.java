package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.additionalDetail.status.AdditionalDetailStatus;
import org.venuspj.sales.core.model.additionalDetail.status.Status;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.utils.Objects2;

/**
 * Created by mizoguchi on 2017/05/28.
 */
public class AdditionalDetail {
    public static final AdditionalDetail DEFAULT = new AdditionalDetail();
    AdditionalDetailId additionalDetailId = new AdditionalDetailId(-1);
    private ChargeGroupId chargeGroupId = new ChargeGroupId(-1);
    Event event = EventProvider.newEvent();
    Status additionalDetailStatus = Status.INITIAL_STATUS;
    ApprovedStatus approvedStatus = ApprovedStatus.INITIAL_STATUS;
    private AdditionalHistories additionalHistories = AdditionalHistories.emptyAdditionalHistories();

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("additionalDetailId",additionalDetailId)
                .add("chargeGroupId",chargeGroupId)
                .add("event",event)
                .add("additionalDetailStatus",additionalDetailStatus)
                .add("approvedStatus",approvedStatus)
                .add("additionalHistories",additionalHistories)
                .add("approvedStatus",approvedStatus)
                .omitNullValues()
                .toString();
    }

    public AdditionalDetail(AdditionalDetailId anAdditionalDetailId, Event anEvent, ChargeGroupId aChargeGroupId, Status anAdditionalDetailStatus,AdditionalHistories anAdditionalHistories) {
        additionalDetailId = anAdditionalDetailId;
        event = anEvent;
        chargeGroupId = aChargeGroupId;
        additionalDetailStatus = anAdditionalDetailStatus;
        additionalHistories = anAdditionalHistories;
    }

    AdditionalDetail() {

    }

    public boolean isPresent() {
        return additionalDetailId.isPresent();
    }

    public ChargeGroupId chargeGroupId() {
        return chargeGroupId;
    }

    public Event event() {
        return event;

    }

    public AdditionalDetailId additionalDetailId() {
        return additionalDetailId;
    }
    public AdditionalHistories additionalHistories() {
        return additionalHistories;
    }

    /**
     * 案件が削除されているかを返却する
     *
     * @return 案件が削除されている場合trueを返却する
     */
    public boolean getIsDroped() {
        return additionalDetailStatus == Status.IS_DROPED;
    }

    public AdditionalDetailHistory getLastHistory() {
        return additionalHistories.getLastAdditionalDetailHistory();

    }

    public Status additionalDetailStatus() {
        return additionalDetailStatus;
    }

    public boolean isApproved() {
        return additionalHistories.isAllApproved();
    }

}
