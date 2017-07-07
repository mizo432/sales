package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.utils.Objects2;

public enum ApprovedStatus {
    NON_APPROVED, APPROVED;

    public boolean isApploved() {
        return Objects2.equal(this, APPROVED);
    }

}
