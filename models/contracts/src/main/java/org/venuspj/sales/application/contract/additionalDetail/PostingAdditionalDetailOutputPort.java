package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.cleanArchtecture.UseCaseOutputPort;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.utils.Objects2;

/**
 */
public class PostingAdditionalDetailOutputPort implements UseCaseOutputPort {
    private final AdditionalDetail additionalDetail;

    public PostingAdditionalDetailOutputPort(AdditionalDetail anAdditionalDetail) {
        additionalDetail = anAdditionalDetail;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("additionalDetail", additionalDetail)
                .omitNullValues()
                .toString();
    }
}
