package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.utils.Objects2;

public class PostingAdditionalDetailOutputPortMock implements PostingAdditionalDetailOutputPort {
    AdditionalDetail additionalDetail;

    @Override
    public void setAdditionalDetail(AdditionalDetail anAdditionalDetail) {
        additionalDetail = anAdditionalDetail;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("additionalDetail", additionalDetail)
                .toString();
    }
}
