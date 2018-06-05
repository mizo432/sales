package org.venuspj.sales.addapters.controller.additionalDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetail;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailInputPort;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailOutputPort;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupIdentifier;
import org.venuspj.sales.core.model.user.UserIdentifier;

@Controller
@Scope("prototype")
public class PostingAdditionalDetailController implements PostingAdditionalDetailInputPort {
    PostingAdditionalDetail postingAdditionalDetail;

    @Autowired
    public PostingAdditionalDetailController(PostingAdditionalDetail aPostingAdditionalDetail) {
        postingAdditionalDetail = aPostingAdditionalDetail;

    }

    @Override
    public UserIdentifier operationUserId() {
        return null;
    }

    @Override
    public ChargeGroupIdentifier chargeGroupIdentifier() {
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
        postingAdditionalDetail.start(this, presenter);

    }
}
