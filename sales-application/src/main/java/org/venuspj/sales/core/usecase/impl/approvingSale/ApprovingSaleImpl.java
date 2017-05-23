package org.venuspj.sales.core.usecase.impl.approvingSale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.sales.core.fundamentals.recordYearMonth.RecordYearMonth;
import org.venuspj.sales.core.model.partnerManagement.chargeGroup.ChargeGroupId;
import org.venuspj.sales.core.usecase.salesManagement.approvingSale.ApprovingSale;

/**
 */
@Service
public class ApprovingSaleImpl implements ApprovingSale {

    @Autowired
    public ApprovingSaleImpl(){

    }


    @Override
    public void doIt(ChargeGroupId aChargeGroupId, RecordYearMonth aRecordYearMonth) {

    }
}
