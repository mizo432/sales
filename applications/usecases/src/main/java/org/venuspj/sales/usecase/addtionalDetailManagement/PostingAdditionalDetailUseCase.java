package org.venuspj.sales.usecase.addtionalDetailManagement;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailInputPort;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetail;
import org.venuspj.sales.application.contract.additionalDetail.PostingAdditionalDetailOutputPort;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.recordDatetime.RecordDateTimeProvider;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailRepository;

/**
 */
@Service
public class PostingAdditionalDetailUseCase implements PostingAdditionalDetail {
    AdditionalDetailRepository additionalDetailRepository;
    EventBus eventBus;
    ClosingService closingService;

    @Autowired
    public PostingAdditionalDetailUseCase(AdditionalDetailRepository additionalDetailRepository, EventBus eventBus, ClosingService closingService) {
        this.additionalDetailRepository = additionalDetailRepository;
        this.eventBus = eventBus;
        this.closingService = closingService;
    }

    @Override
    public void start(PostingAdditionalDetailInputPort inputPort,
                      PostingAdditionalDetailOutputPort outputPort) {

        closingService.reopenIfClosed(inputPort.chargeGroupId(), inputPort.moment());

        AdditionalDetail additionalDetail = new AdditionalDetail(AdditionalDetailId.empty(), new Event(RecordDateTimeProvider.currentRecordDateTime(), inputPort.operationUserId()), inputPort.chargeGroupId());

        additionalDetailRepository.store(additionalDetail);
        outputPort.setAdditionalDetail(additionalDetail);

        eventBus.post(PostedAddtionalDetail.of(additionalDetail.additionalDetailId(), inputPort.moment()));

    }

}
