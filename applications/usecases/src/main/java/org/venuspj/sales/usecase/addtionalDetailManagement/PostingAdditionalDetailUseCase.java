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
    PostingAdditionalDetailInputPort inputPort;
    PostingAdditionalDetailOutputPort outputPort;
    EventBus eventBus;
    ClosingService closingService;
    @Autowired
    public PostingAdditionalDetailUseCase(AdditionalDetailRepository anAdditionalDetailRepository,EventBus anEventBus,ClosingService aClosingService){
        additionalDetailRepository = anAdditionalDetailRepository;
        eventBus = anEventBus;
        closingService = aClosingService;
    }
    @Override
    public PostingAdditionalDetail withInputPort(PostingAdditionalDetailInputPort anInputPort) {
        inputPort = anInputPort;
        return this;
    }

    @Override
    public PostingAdditionalDetail withOutputPort(PostingAdditionalDetailOutputPort anOutputPort) {
        outputPort = anOutputPort;
        return this;
    }

    @Override
    public void start() {
        closingService.reopenIfClosed(inputPort.chargeGroupId(),inputPort.moment());
        AdditionalDetail additionalDetail = new AdditionalDetail(AdditionalDetailId.empty(),new Event(RecordDateTimeProvider.currentRecordDateTime(),inputPort.operationUserId()),inputPort.chargeGroupId());
        additionalDetailRepository.store(additionalDetail);
        eventBus.post(PostedAddtionalDetail.of(additionalDetail.additionalDetailId(),inputPort.moment()));
        outputPort.setAdditionalDetail(additionalDetail);
    }
}
