package org.venuspj.sales.core.model.partnerManagement.chargeGroup;

import org.venuspj.sales.externals.Maps2;

import java.util.Map;

/**
 */
public class ChargeGroupRepositoryMock implements ChargeGroupRepository {
    public static final ChargeGroupId DEFAULT_CHARGE_GROUP_ID = new ChargeGroupId(1);

    private Map<ChargeGroupId, ChargeGroup> map = Maps2.newHashMap();

    ChargeGroupRepositoryMock(Map<ChargeGroupId, ChargeGroup> aTestChargeGroupMap) {
        map = aTestChargeGroupMap;
    }

    @Override
    public ChargeGroup findOne(ChargeGroupId aChargeGroupId) {
        ChargeGroup result = map.get(aChargeGroupId);
        return result;
    }

    public static ChargeGroupRepositoryMock createChargeGroupRepositoryMock() {
        return new ChargeGroupRepositoryMock(createTestChargeGroupMap());
    }

    private static Map<ChargeGroupId, ChargeGroup> createTestChargeGroupMap() {
        Map<ChargeGroupId, ChargeGroup> result = Maps2.newHashMap();
        ChargeGroupId chargeGroupId = DEFAULT_CHARGE_GROUP_ID;
        ChargeGroup chargeGroup = new ChargeGroup(chargeGroupId);
        result.put(chargeGroupId, chargeGroup);
        return result;
    }

}
