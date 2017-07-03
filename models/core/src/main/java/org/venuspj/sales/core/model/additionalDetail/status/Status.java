package org.venuspj.sales.core.model.additionalDetail.status;

/**
 * Created by mizoguchi on 2017/05/28.
 */
public enum Status {
    APPROVED;

    public boolean isApproved() {
        return this == Status.APPROVED;
    }
}
