package org.venuspj.sales.core.model.accountManagement.account;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AccountNumber {
    private Integer value;

    AccountNumber(){

    }
    public AccountNumber(Integer aValue){
        value = aValue;

    }
    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }
}
