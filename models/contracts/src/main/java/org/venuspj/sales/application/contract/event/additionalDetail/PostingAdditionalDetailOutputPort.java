package org.venuspj.sales.application.contract.event.additionalDetail;

import org.venuspj.cleanArchitecture.useCase.UseCaseOutputPort;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetail;

/**
 */
public interface PostingAdditionalDetailOutputPort extends UseCaseOutputPort {
    void setAdditionalDetail(AdditionalDetail anAdditionalDetail);
}
