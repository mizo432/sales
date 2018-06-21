package org.venuspj.sales.fragment.partyPlaceThing.thing;

import org.venuspj.sales.fragment.partyPlaceThing.PartyPlaceThing;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.nonNull;

public interface Thing extends PartyPlaceThing<Thing> {

    ThingName getName();

    public static class ThingBuilder extends ObjectBuilder<Thing, ThingBuilder> {

        private ThingName name;

        @Override
        protected void apply(Thing vo, ThingBuilder builder) {
            builder.withName(vo.getName());
        }

        public ThingBuilder withName(ThingName name) {
            if (nonNull(name))
                addConfigurator(builder -> builder.name = name);
            return getThis();

        }


        @Override
        protected Thing createValueObject() {
            return new ThingImpl(name);
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
