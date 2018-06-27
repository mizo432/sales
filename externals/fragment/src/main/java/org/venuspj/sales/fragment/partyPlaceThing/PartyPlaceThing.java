package org.venuspj.sales.fragment.partyPlaceThing;

import org.venuspj.sales.fragment.description.Description;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.nonNull;

public interface PartyPlaceThing<PPT extends PartyPlaceThing<PPT, D>, D extends Description<PPT, D>> {

    D getDescription();

    abstract class PartyPlaceThingBuilder<PPT extends PartyPlaceThing<PPT, D>, PPTB extends PartyPlaceThingBuilder<PPT, PPTB, D>, D extends Description<PPT, D>> extends ObjectBuilder<PPT, PPTB> {
        protected D description;

        @Override
        protected void apply(PPT vo, PPTB builder) {
            builder.withDescription(vo.getDescription());

        }

        public PPTB withDescription(D description) {
            if (nonNull(description))
                addConfigurator(builder -> builder.description = description);
            return getThis();

        }

    }

}
