package org.venuspj.sales.usecase.addtionalDetailManagement;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetail;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailInputPort;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailOutputPort;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailRepository;

/**
 */
@Service
public class PostingAdditionalDetailUseCase implements PostingAdditionalDetail {
    private final AdditionalDetailRepository additionalDetailRepository;
    private final EventBus eventBus;
    private final ClosingService closingService;

    @Autowired
    public PostingAdditionalDetailUseCase(AdditionalDetailRepository additionalDetailRepository, EventBus eventBus, ClosingService closingService) {
        this.additionalDetailRepository = additionalDetailRepository;
        this.eventBus = eventBus;
        this.closingService = closingService;
    }

    @Override
    public void start(PostingAdditionalDetailInputPort request,
                      PostingAdditionalDetailOutputPort response) {

        closingService.reopenIfClosed(request.chargeGroupIdentifier(), request.moment());

        AdditionalDetail additionalDetail = new AdditionalDetail(AdditionalDetailId.empty(), EventProvider.newEvent(),request.chargeGroupIdentifier());

        additionalDetailRepository.store(additionalDetail);
        response.setAdditionalDetail(additionalDetail);

        eventBus.post(PostedAddtionalDetail.of(additionalDetail.additionalDetailId(), request.moment()));

    }


}
