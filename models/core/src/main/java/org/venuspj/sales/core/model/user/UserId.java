package org.venuspj.sales.core.model.user;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class UserId {
    Integer value;
    public UserId(){

    }
    public UserId(Integer aValue){
        value = aValue;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
