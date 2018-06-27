package org.venuspj.sales.core.model.product;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.sales.fragment.partyPlaceThing.thing.Thing;
import org.venuspj.sales.fragment.partyPlaceThing.thing.ThingImpl;

import static org.venuspj.util.objects2.Objects2.nonNull;

/**
 * 販売対象（物、サービスが該当する）
 * <pre>
 * 個別の商品の場合とカタログ的な場合がある。
 * </pre>
 */
public class ProductImpl extends AbstractEntity<Product, ProductIdentifier> implements Product {

    private Thing thing = new ThingImpl();

    public ProductImpl() {

    }

    ProductImpl(ProductIdentifier productIdentifier, Thing thing) {
        super(productIdentifier);
        this.thing = thing;

    }

    public Thing getThing() {
        return thing;

    }

}
