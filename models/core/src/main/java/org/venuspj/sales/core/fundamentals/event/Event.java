package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.model.user.UserId;

/**
 */
public class Event {
    WhenOccurred whenOccurred;
    UserId userId;

    Event() {
    }

    public Event(WhenOccurred whenOccurred, UserId userId) {
        this.whenOccurred = whenOccurred;
        this.userId = userId;
    }

    public WhenOccurred whenOccurred() {
        return whenOccurred;
    }

}
