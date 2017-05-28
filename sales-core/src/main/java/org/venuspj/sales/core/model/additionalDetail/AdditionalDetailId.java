package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.externals.Objects2;

/**
 */
public class AdditionalDetailId {
    private Integer value = -1;

    AdditionalDetailId() {
    }

    public AdditionalDetailId(Integer aValue) {
        value = aValue;
    }

    public boolean isPresent() {
        return !Integer.valueOf(-1).equals(value);
    }
}
