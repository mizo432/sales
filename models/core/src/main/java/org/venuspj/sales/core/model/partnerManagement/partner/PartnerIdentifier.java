package org.venuspj.sales.core.model.partnerManagement.partner;

import static org.venuspj.sales.utils.Objects2.nonNull;

public class PartnerIdentifier {
    private Integer value;

    public PartnerIdentifier(Integer aValue) {
        value = aValue;

    }
    
    public PartnerIdentifier() {

    }

    public boolean isPresent() {
        return nonNull(value);
    }
}
