package org.venuspj.sales.core.model.partnerManagement.store;

import org.venuspj.sales.utils.Objects2;

public class Store {
    StoreIdentifier storeIdentifier;

    Store() {
    }

    public Store(StoreIdentifier aStoreIdentifier) {
        storeIdentifier = aStoreIdentifier;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("storeIdentifier", storeIdentifier)
                .omitNullValues()
                .toString();
    }
}
