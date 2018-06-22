package org.venuspj.sales.fragment.description.thing;

import org.venuspj.sales.fragment.description.Description;
import org.venuspj.util.builder.ObjectBuilder;

/**
 * 物詳細
 */
public interface ThingDescription extends Description<ThingDescription> {


    class ThingDescriptionBuilder extends ObjectBuilder<ThingDescription, ThingDescriptionBuilder> {

        @Override
        protected void apply(ThingDescription vo, ThingDescriptionBuilder builder) {

        }

        @Override
        protected ThingDescription createValueObject() {
            return new ThingDescriptionImpl();
        }

        @Override
        protected ThingDescriptionBuilder getThis() {
            return this;
        }

        @Override
        protected ThingDescriptionBuilder newInstance() {
            return new ThingDescriptionBuilder();
        }
    }

}
