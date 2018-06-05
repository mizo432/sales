package org.venuspj.sales.usecase.addtionalDetailManagement.approving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.ddd.exception.EntityNotFoundException;
import org.venuspj.sales.application.contract.addtionalDetailManagement.approvingAdditionDetail.ApprovingAdditionDetail;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.AdditionalDetailRepository;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status.AdditionalDetailStatus;
import org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status.ApploveStatus;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroup;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupRepository;
import org.venuspj.sales.exceptions.ChargeGroupIsAlreadyClosedException;

import java.util.Map;

import static org.venuspj.util.collect.Maps2.newHashMap;

@Service
public class Approving implements ApprovingAdditionDetail {

    private final AdditionalDetailRepository additionalDetailRepository;

    private final ChargeGroupRepository chargeGroupRepository;

    @Autowired
    public Approving(AdditionalDetailRepository additionalDetailRepository, ChargeGroupRepository chargeGroupRepository) {
        this.additionalDetailRepository = additionalDetailRepository;
        this.chargeGroupRepository = chargeGroupRepository;

    }

    private Map<AdditionalDetailId, ApprovingAdditionDetail> getTestDataMap() {
        return newHashMap();
    }

    AdditionalDetail start(AdditionalDetailId anAdditionalDetailId) {

        AdditionalDetail additionalDetail = additionalDetailRepository.findOne(anAdditionalDetailId);
        if (!additionalDetail.isPresent())
            throw new EntityNotFoundException("追加明細が存在しないため承認できません。chargeGroupIdentifier:");
        if (!additionalDetail.isApproved())
            throw new IllegalStateException("追加明細はすでに承認済みです");
        ChargeGroup chargeGroup = chargeGroupRepository.findOne(additionalDetail.chargeGroupId());
        RecordYearMonth recordYearMonth = additionalDetail.event().whenOccurred().asRecordDateTime().recordYearMonth();
        if (chargeGroup.hadClosedInvoice(recordYearMonth))
            throw new ChargeGroupIsAlreadyClosedException("請求先グループは既に請求締めされているため承認できません");
        if (chargeGroup.hadClosedFutureInvoice(additionalDetail.event().whenOccurred().asRecordDateTime().recordYearMonth()))
            throw new ChargeGroupIsAlreadyClosedException("請求先グループは既に請求締めされているため承認できません");

        Event event = EventProvider.newEvent();
        AdditionalDetailStatus aAdditionalDetailStatus = new AdditionalDetailStatus(event, ApploveStatus.APPROVED);
        additionalDetailRepository.storeAdditionalDetailStatus(anAdditionalDetailId, aAdditionalDetailStatus);
        return additionalDetailRepository.findOne(anAdditionalDetailId);

    }

}
