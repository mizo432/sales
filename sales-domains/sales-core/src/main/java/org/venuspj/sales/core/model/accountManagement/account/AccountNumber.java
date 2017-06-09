package org.venuspj.sales.core.model.accountManagement.account;

import org.venuspj.sales.utils.Objects2;

public class AccountNumber {
    private Integer value;

    AccountNumber(){

    }
    public AccountNumber(Integer aValue){
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
