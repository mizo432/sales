package org.venuspj.sales.core.model.product;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.sales.fragment.partyPlaceThing.thing.Thing;

public interface Product extends Entity<Product, ProductIdentifier> {
    Thing getThing();
}
