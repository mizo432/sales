package org.venuspj.sales.core.model.user;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class UserIdProvider {
    private static UserIdentifier userIdentifier;

    public static void setUserIdentifier(UserIdentifier anUserIdentifier) {
        userIdentifier = anUserIdentifier;

    }

    public static UserIdentifier currentUserId() {
        if (nonNull(userIdentifier)) {
            return userIdentifier;
        }

        return new UserIdentifier(0);
    }
}
