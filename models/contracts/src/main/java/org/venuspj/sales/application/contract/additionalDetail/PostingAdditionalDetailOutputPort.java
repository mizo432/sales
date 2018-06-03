package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.cleanArchtecture.UseCaseOutputPort;
import org.venuspj.sales.core.model.invoice.details.additionalDetail.AdditionalDetail;

/**
 */
public interface PostingAdditionalDetailOutputPort extends UseCaseOutputPort {
    void setAdditionalDetail(AdditionalDetail anAdditionalDetail);
}
