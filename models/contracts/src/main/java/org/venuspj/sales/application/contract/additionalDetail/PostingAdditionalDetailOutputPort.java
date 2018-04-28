package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.cleanArchtecture.UseCaseOutputPort;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;

/**
 */
public interface PostingAdditionalDetailOutputPort extends UseCaseOutputPort {
    void setAdditionalDetail(AdditionalDetail anAdditionalDetail);
}
