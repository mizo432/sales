package org.venuspj.sales.addapters.controller.additionalDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.venuspj.sales.application.contract.additionalDetail.InputPort;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetail;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailOutputPort;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.core.model.user.UserId;

@Controller
@Scope("prototype")
public class PostingAdditionalDetailController implements InputPort {
    PostingAdditionalDetail postingAdditionalDetail;

    @Autowired
    public PostingAdditionalDetailController(PostingAdditionalDetail aPostingAdditionalDetail) {
        postingAdditionalDetail = aPostingAdditionalDetail;

    }

    @Override
    public UserId operationUserId() {
        return null;
    }

    @Override
    public ChargeGroupId chargeGroupId() {
        return null;
    }

    @Override
    public Event moment() {
        return null;
    }

    public void post() {
        PostingAdditionalDetailOutputPort presenter = new PostingAdditionalDetailOutputPort() {
            AdditionalDetail additionalDetail;

            @Override
            public void setAdditionalDetail(AdditionalDetail anAdditionalDetail) {
                additionalDetail = anAdditionalDetail;
            }
        };
        postingAdditionalDetail
                .withInputPort(this)
                .withOutputPort(presenter)
                .start();
    }
}
