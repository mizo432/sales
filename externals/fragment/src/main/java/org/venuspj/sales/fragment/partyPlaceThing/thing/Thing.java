package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.venuspj.sales.fragment.description.thing.ThingDescription;
import org.venuspj.sales.fragment.partyPlaceThing.PartyPlaceThing;

import static org.venuspj.util.objects2.Objects2.nonNull;

public interface Thing extends PartyPlaceThing<Thing, ThingDescription> {

    ThingName getName();

    class ThingBuilder extends PartyPlaceThingBuilder<Thing, ThingBuilder, ThingDescription> {

        private ThingName name = new ThingName();

        @Override
        protected void apply(Thing vo, ThingBuilder builder) {
            super.apply(vo, builder);
            builder.withName(vo.getName());
        }

        public ThingBuilder withName(ThingName name) {
            if (nonNull(name))
                addConfigurator(builder -> builder.name = name);
            return getThis();

        }

        @Override
        protected Thing createValueObject() {
            return new ThingImpl(description, name);

        }

        @Override
        protected ThingBuilder getThis() {
            return this;

        }

        @Override
        protected ThingBuilder newInstance() {
            return new ThingBuilder();

        }

    }

}
