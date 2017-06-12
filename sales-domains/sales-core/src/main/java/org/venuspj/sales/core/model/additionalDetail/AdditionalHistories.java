package org.venuspj.sales.core.model.additionalDetail;

import org.venuspj.sales.utils.Lists2;
import org.venuspj.sales.utils.Objects2;

import java.util.List;

public class AdditionalHistories {
    List<AdditionalDetailHistory> list = Lists2.newArrayList();

    AdditionalHistories() {
    }

    public AdditionalHistories(List<AdditionalDetailHistory> aList) {
        list.addAll(aList);
    }

    public AdditionalDetailHistory getLastAdditionalDetailHistory() {
        return null;
    }

    public static AdditionalHistories emptyAdditionalHistories() {
        return new AdditionalHistories();
    }

    public boolean isAllApproved() {
        // TODO atdk
        return false;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
