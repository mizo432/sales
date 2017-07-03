package org.venuspj.sales.core.model.additionalDetail;


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

    public static AdditionalDetailId empty() {
        return new AdditionalDetailId();
    }
}
