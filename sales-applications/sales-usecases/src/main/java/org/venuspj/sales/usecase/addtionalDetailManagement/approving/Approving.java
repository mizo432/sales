package org.venuspj.sales.usecase.addtionalDetailManagement.approving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.sales.core.exceptions.ChargeGroupIsAlreadyClosedException;
import org.venuspj.sales.core.exceptions.EntityNotFoundException;
import org.venuspj.sales.core.fundamentals.event.Event;
import org.venuspj.sales.core.fundamentals.event.EventProvider;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetail;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailId;
import org.venuspj.sales.core.model.additionalDetail.AdditionalDetailRepository;
import org.venuspj.sales.core.model.additionalDetail.status.AdditionalDetailStatus;
import org.venuspj.sales.core.model.additionalDetail.status.Status;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroup;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupRepository;
import org.venuspj.sales.core.usecase.addtionalDetailManagement.approvingAdditionDetail.ApprovingAdditionDetail;
import org.venuspj.sales.utils.Maps2;

import java.util.Map;

@Service
public class Approving implements ApprovingAdditionDetail {

    AdditionalDetailRepository additionalDetailRepository;

    ChargeGroupRepository chargeGroupRepository;

    @Autowired
    public Approving(AdditionalDetailRepository anAdditionalDetailRepository, ChargeGroupRepository aChargeGroupRepository) {
        additionalDetailRepository = anAdditionalDetailRepository;
        chargeGroupRepository = aChargeGroupRepository;

    }

    private Map<AdditionalDetailId, ApprovingAdditionDetail> getTestDataMap() {
        return Maps2.newHashMap();
    }

    AdditionalDetail start(AdditionalDetailId anAdditionalDetailId) {

        AdditionalDetail additionalDetail = additionalDetailRepository.findOne(anAdditionalDetailId);
        if (!additionalDetail.isPresent())
            throw new EntityNotFoundException("追加明細が存在しないため承認できません。chargeGroupId:");
        if (!additionalDetail.isApproved())
            throw new IllegalStateException("追加明細はすでに承認済みです");
        ChargeGroup chargeGroup = chargeGroupRepository.findOne(additionalDetail.chargeGroupId());
        RecordYearMonth recordYearMonth = additionalDetail.event().recordYearMonth();
        if (chargeGroup.hadClosedInvoice(recordYearMonth))
            throw new ChargeGroupIsAlreadyClosedException("請求先グループは既に請求締めされているため承認できません");
        if (chargeGroup.hadClosedFutureInvoice(additionalDetail.event().recordDatetime().recordYearMonth()))
            throw new ChargeGroupIsAlreadyClosedException("請求先グループは既に請求締めされているため承認できません");

        Event event = EventProvider.newEvent();
        AdditionalDetailStatus aAdditionalDetailStatus = new AdditionalDetailStatus(event, Status.APPROVED);
        additionalDetailRepository.storeAdditionalDetailStatus(anAdditionalDetailId, aAdditionalDetailStatus);
        return additionalDetailRepository.findOne(anAdditionalDetailId);

    }

}
