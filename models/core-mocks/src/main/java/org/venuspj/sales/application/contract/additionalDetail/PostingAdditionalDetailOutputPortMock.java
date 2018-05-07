package org.venuspj.sales.application.contract.additionalDetail;

import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class PostingAdditionalDetailOutputPortMock implements PostingAdditionalDetailOutputPort {
    AdditionalDetail additionalDetail;

    @Override
    public void setAdditionalDetail(AdditionalDetail anAdditionalDetail) {
        additionalDetail = anAdditionalDetail;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
