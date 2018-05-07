package org.venuspj.sales.core.model.user;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class UserIdProvider {
    private static UserId userId;

    public static void setUserId(UserId anUserId) {
        userId = anUserId;

    }

    public static UserId currentUserId() {
        if (nonNull(userId)) {
            return userId;
        }

        return new UserId(0);
    }
}
