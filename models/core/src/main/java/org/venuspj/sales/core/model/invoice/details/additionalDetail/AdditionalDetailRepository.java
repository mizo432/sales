package org.venuspj.sales.core.model.invoice.details.additionalDetail;

import org.venuspj.sales.core.model.invoice.details.additionalDetail.status.AdditionalDetailStatus;

/**
 */
public interface AdditionalDetailRepository {
    AdditionalDetail findOne(AdditionalDetailId anAdditionalDetailId);

    void storeAdditionalDetailStatus(AdditionalDetailId anAdditionalDetailId, AdditionalDetailStatus aAdditionalDetailStatus);

    void store(AdditionalDetail additionalDetail);
}
