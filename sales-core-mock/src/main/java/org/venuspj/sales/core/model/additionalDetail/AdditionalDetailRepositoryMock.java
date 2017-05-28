package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailRepository;
import org.venuspj.sales.core.model.additionalDetail.status.AdditionalDetailStatus;
import org.venuspj.sales.core.model.additionalDetail.status.Status;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupRepositoryMock;
import org.venuspj.sales.core.usecase.addtionalDetailManagement.approvingAdditionDetail.ApprovingAdditionDetail;
import org.venuspj.sales.externals.Maps2;
import org.venuspj.sales.externals.Objects2;

import java.util.Map;

/**
 */
public class AdditionalDetailRepositoryMock implements AdditionalDetailRepository {
    public static final AdditionalDetailId DEFAULT_ADDITIONAL_DETAIL_ID = new AdditionalDetailId(1);

    Map<AdditionalDetailId, AdditionalDetail> map;

    AdditionalDetailRepositoryMock(Map<AdditionalDetailId, AdditionalDetail> aTestDataMap) {
        map = aTestDataMap;
    }

    @Override
    public AdditionalDetail findOne(AdditionalDetailId anAdditionalDetailId) {
        AdditionalDetail result = map.get(anAdditionalDetailId);
        if (Objects2.nonNull(result))
            return result;
        return AdditionalDetail.DEFAULT;
    }

    @Override
    public void storeAdditionalDetailStatus(AdditionalDetailId anAdditionalDetailId, AdditionalDetailStatus aAdditionalDetailStatus) {

    }

    private static Map<AdditionalDetailId, AdditionalDetail> createTestAdditionalDetailMap() {
        Map<AdditionalDetailId, AdditionalDetail> result = Maps2.newHashMap();
        AdditionalDetailId additionalDetailId = DEFAULT_ADDITIONAL_DETAIL_ID;
        Event event = new Event();
        result.put(additionalDetailId, new AdditionalDetail(additionalDetailId, event, ChargeGroupRepositoryMock.DEFAULT_CHARGE_GROUP_ID, new AdditionalDetailStatus(event,Status.APPROVED)));
        return result;

    }

    public static AdditionalDetailRepositoryMock createChargeGroupRepositoryMock() {
        return new AdditionalDetailRepositoryMock(createTestAdditionalDetailMap());
    }
}
