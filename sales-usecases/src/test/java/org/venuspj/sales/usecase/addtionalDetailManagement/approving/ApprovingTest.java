package org.venuspj.sales.usecase.addtionalDetailManagement.approving;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailRepository;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailRepositoryMock;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupRepository;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupRepositoryMock;
import org.venuspj.sales.externals.Maps2;

import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class ApprovingTest {

    private AdditionalDetailRepository additionalDetailRepository = null;
    private ChargeGroupRepository chargeGroupRepository;
    private Approving targetUseCase;

    @Before
    public void setUp() {
        chargeGroupRepository = ChargeGroupRepositoryMock.createChargeGroupRepositoryMock();
        additionalDetailRepository = AdditionalDetailRepositoryMock.createChargeGroupRepositoryMock();
        targetUseCase = new Approving(additionalDetailRepository, chargeGroupRepository);

    }

    @After
    public void tearDown() {
        targetUseCase = null;

    }

    @Test
    public void start() throws Exception {
        AdditionalDetail actual = targetUseCase.start(AdditionalDetailRepositoryMock.DEFAULT_ADDITIONAL_DETAIL_ID);
        assertThat(actual)
                .isNotNull();
        assertThat(actual.additionalDetailId())
                .isNotNull()
                .isEqualTo(AdditionalDetailRepositoryMock.DEFAULT_ADDITIONAL_DETAIL_ID);
        assertThat(actual.isApproved())
                .isEqualTo(true);

    }

}