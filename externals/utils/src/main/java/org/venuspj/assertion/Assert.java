package org.venuspj.assertion;


import java.util.function.Supplier;

import static org.venuspj.util.objects2.Objects2.isNull;

public class Assert {
    public static void nonNull(Object object) {
        nonNull(object, "");

    }

    public static void nonNull(Object object, String message) {
        nonNull(object, new Supplier<String>() {
            @Override
            public String get() {
                return message;
            }
        });

    }

    public static void nonNull(Object object, Supplier<String> messageSupplier) {
        if (isNull(object))
            throw new AssertionException(messageSupplier.get());

    }

}
