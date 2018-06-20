package org.venuspj.sales.usecase.addtionalDetailManagement.approving;

import com.google.common.eventbus.EventBus;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailRepository;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status.AdditionalDetailStatus;
import org.venuspj.sales.core.model.event.closing.Closing;
import org.venuspj.sales.usecase.addtionalDetailManagement.ClosingCredential;
import org.venuspj.sales.usecase.addtionalDetailManagement.ClosingRepository;
import org.venuspj.sales.usecase.addtionalDetailManagement.ClosingService;
import org.venuspj.sales.usecase.addtionalDetailManagement.PostingAdditionalDetailUseCase;

public class PostingAdditionalDetailUseCaseTest {

    PostingAdditionalDetail postingAdditionalDetail;
    AdditionalDetailRepository additionalDetailRepository;
    EventBus eventBus;
    private ClosingService closingService;
    ClosingRepository closingRepositry;

    @Before
    public void setUp() throws Exception {
        additionalDetailRepository = new AdditionalDetailRepository() {
            @Override
            public AdditionalDetail findOne(AdditionalDetailId anAdditionalDetailId) {
                return null;
            }

            @Override
            public void storeAdditionalDetailStatus(AdditionalDetailId anAdditionalDetailId, AdditionalDetailStatus aAdditionalDetailStatus) {

            }

            @Override
            public void store(AdditionalDetail additionalDetail) {

            }
        };

        eventBus = new EventBus();
        closingRepositry = new ClosingRepository() {
            @Override
            public Closing findOne(ClosingCredential closingCredential) {
                return null;
            }

            @Override
            public void store(Closing reopen) {

            }
        };
        closingService = new ClosingService(closingRepositry);
        postingAdditionalDetail = new PostingAdditionalDetailUseCase(additionalDetailRepository, eventBus, closingService);
    }

    @After
    public void tearDown() throws Exception {
        postingAdditionalDetail = null;

    }

    @Test
    @Ignore
    public void start() throws Exception {
        PostingAdditionalDetailInputPort inputport = PostingAdditionalDetailInputPortMock.createMock();
        PostingAdditionalDetailOutputPort outputPort = new PostingAdditionalDetailOutputPortMock();
        postingAdditionalDetail
                .start(inputport, outputPort);
        System.out.println("outputPort" + outputPort);
    }
}
