package org.venuspj.sales.core.model.materializedClaim.details.additionalDetail;

import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status.AdditionalDetailStatus;

/**
 */
public interface AdditionalDetailRepository {
    AdditionalDetail findOne(AdditionalDetailId anAdditionalDetailId);

    void storeAdditionalDetailStatus(AdditionalDetailId anAdditionalDetailId, AdditionalDetailStatus aAdditionalDetailStatus);

    void store(AdditionalDetail additionalDetail);
}
