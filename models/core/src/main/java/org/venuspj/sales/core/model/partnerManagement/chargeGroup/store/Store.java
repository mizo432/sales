package org.venuspj.sales.core.model.partnerManagement.chargeGroup.store;

public class Store {
    StoreIdentifier storeIdentifier;

    Store() {
    }

    public Store(StoreIdentifier storeIdentifier) {
        this.storeIdentifier = storeIdentifier;
    }

    public StoreIdentifier getStoreIdentifier() {
        return storeIdentifier;
    }
}
