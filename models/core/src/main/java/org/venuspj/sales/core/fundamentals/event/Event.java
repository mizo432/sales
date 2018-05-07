package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.model.user.UserIdentifier;

/**
 */
public class Event {
    WhenOccurred whenOccurred;
    UserIdentifier userIdentifier;

    Event() {
    }

    public Event(WhenOccurred whenOccurred, UserIdentifier userIdentifier) {
        this.whenOccurred = whenOccurred;
        this.userIdentifier = userIdentifier;
    }

    public WhenOccurred whenOccurred() {
        return whenOccurred;
    }

}
