package org.venuspj.sales.utils.assertion;

import org.venuspj.sales.utils.Objects2;

public class Assert {
    public static void nonNull(Object object) {
        nonNull(object,"");

    }

    public static void nonNull(Object object,String message) {
        if(Objects2.isNull(object))
            throw new AssertionException(message);

    }
}
