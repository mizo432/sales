package org.venuspj.assertion;


import static org.venuspj.util.objects2.Objects2.isNull;

public class Assert {
    public static void nonNull(Object object) {
        nonNull(object,"");

    }

    public static void nonNull(Object object,String message) {
        if(isNull(object))
            throw new AssertionException(message);

    }
}
