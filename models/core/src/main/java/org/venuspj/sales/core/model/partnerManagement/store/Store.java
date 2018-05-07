package org.venuspj.sales.core.model.partnerManagement.store;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Store {
    StoreIdentifier storeIdentifier;

    Store() {
    }

    public Store(StoreIdentifier aStoreIdentifier) {
        storeIdentifier = aStoreIdentifier;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
