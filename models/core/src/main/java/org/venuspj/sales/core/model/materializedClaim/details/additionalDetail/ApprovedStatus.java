package org.venuspj.sales.core.model.materializedClaim.details.additionalDetail;

import static org.venuspj.util.objects2.Objects2.equal;

public enum ApprovedStatus {
    NON_APPROVED, APPROVED;

    public boolean isApploved() {
        return equal(this, APPROVED);
    }

}
