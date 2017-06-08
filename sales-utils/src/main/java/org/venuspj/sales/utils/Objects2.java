package org.venuspj.sales.utils;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 */
public class Objects2 {
    public static boolean equal(Object a, Object b) {
        return Objects.equals(a, b);
    }

    public static boolean nonNull(Object obj) {
        return !isNull(obj);

    }

    public static boolean isNull(Object obj) {
        return Objects.isNull(obj);

    }

    public static MoreObjects.ToStringHelper toStringHelper(Object obj) {
        return MoreObjects.toStringHelper(obj);

    }

    public static int hash(Object... objects) {
        return Objects.hash(objects);
    }
}
