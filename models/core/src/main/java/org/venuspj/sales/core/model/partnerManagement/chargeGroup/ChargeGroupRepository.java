package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

/**
 */
public interface ChargeGroupRepository {
    ChargeGroup findOne(ChargeGroupIdentifier chargeGroupIdentifier);

}
