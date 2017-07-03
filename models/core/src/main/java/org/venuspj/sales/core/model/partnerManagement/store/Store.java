package org.venuspj.sales.core.model.partnerManagement.store;

import org.venuspj.sales.utils.Objects2;

public class Store {
    StoreId storeId;

    Store() {
    }

    public Store(StoreId aStoreId) {
        storeId = aStoreId;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("storeId", storeId)
                .omitNullValues()
                .toString();
    }
}
