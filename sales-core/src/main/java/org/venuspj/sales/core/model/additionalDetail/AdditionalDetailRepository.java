package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.core.model.additionalDetail.status.AdditionalDetailStatus;

/**
 */
public interface AdditionalDetailRepository {
    AdditionalDetail findOne(AdditionalDetailId anAdditionalDetailId);

    void storeAdditionalDetailStatus(AdditionalDetailId anAdditionalDetailId, AdditionalDetailStatus aAdditionalDetailStatus);
}
