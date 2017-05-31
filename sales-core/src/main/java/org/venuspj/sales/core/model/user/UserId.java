package org.venuspj.sales.core.model.user;

import org.venuspj.sales.externals.Objects2;

public class UserId {
    Integer value;
    UserId(){

    }
    public UserId(Integer aValue){
        value = aValue;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
