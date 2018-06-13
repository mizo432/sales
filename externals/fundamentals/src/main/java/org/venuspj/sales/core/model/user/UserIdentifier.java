package org.venuspj.sales.core.model.user;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class UserIdentifier {
    private Integer value;
    public UserIdentifier(){

    }
    public UserIdentifier(Integer value){
        this.value = value;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .defaultConfig()
                .toString();
    }

    public Integer asInteger(){
        return value;

    }
}
