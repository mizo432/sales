package org.venuspj.sales.core.model.additionalDetail.status;

/**
 */
public enum ApploveStatus {
    APPROVED, NON_APPLOVED;

    public static final ApploveStatus INITIAL = NON_APPLOVED;

    public boolean isApproved() {
        return this == ApploveStatus.APPROVED;
    }
}
