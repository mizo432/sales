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
public class Product extends AbstractEntity<Product, ProductIdentifier> {
    private Thing thing = new ThingImpl();

    public Product() {

    }

    public Product(ProductIdentifier productIdentifier, Thing thing) {
        super(productIdentifier);
        this.thing = thing;

    }

    public Thing getThing() {
        return thing;

    }

    public static class ProductBuilder extends AbstractEntityBuilder<Product, ProductBuilder, ProductIdentifier> {
        private Thing thing = new ThingImpl();

        @Override
        protected void apply(Product vo, ProductBuilder builder) {
            super.apply(vo, builder);
            builder.withThing(vo.getThing());
        }

        public ProductBuilder withThing(Thing thing) {

            if (nonNull(thing))
                addConfigurator(builder -> builder.thing = thing);

            return getThis();

        }

        @Override
        protected Product createValueObject() {
            return new Product(identifier, thing);
        }

        @Override
        protected ProductBuilder getThis() {
            return this;
        }

        @Override
        protected ProductBuilder newInstance() {
            return new ProductBuilder();
        }
    }

}
