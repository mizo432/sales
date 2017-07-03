package org.venuspj.sales.core.model.user;

import org.venuspj.sales.utils.Objects2;

public class UserIdProvider {
    private static UserId userId;

    public static void setUserId(UserId anUserId) {
        userId = anUserId;

    }

    public static UserId currentUserId() {
        if (Objects2.nonNull(userId)) {
            return userId;
        }

        return new UserId(0);
    }
}
