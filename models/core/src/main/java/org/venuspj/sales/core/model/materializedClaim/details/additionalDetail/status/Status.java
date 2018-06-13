package org.venuspj.sales.core.model.materializedClaim.details.additionalDetail.status;

/**
 * Created by mizoguchi on 2017/05/28.
 */
public enum Status {
    APPROVED, INITIAL_STATUS, IS_DROPED;

    public boolean isApproved() {
        return this == Status.APPROVED;
    }
}
