package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.utils.Objects2;

public class Balance {
    private Integer value;

    Balance(){

    }
    public Balance(Integer aValue){
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
