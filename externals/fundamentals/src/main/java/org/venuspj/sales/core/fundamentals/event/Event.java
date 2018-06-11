package org.venuspj.sales.core.fundamentals.event;

import org.venuspj.sales.core.fundamentals.whenOccurred.WhenOccurred;
import org.venuspj.sales.core.model.user.UserIdentifier;

/**
 * 誰が何かをしたというのを管理するクラスです.
 */
public class Event {
    WhenOccurred whenOccurred = new WhenOccurred();
    UserIdentifier userIdentifier = new UserIdentifier();

    public Event() {
    }

    public WhenOccurred getWhenOccurred() {
        return whenOccurred;
    }

    public UserIdentifier getUserIdentifier() {
        return userIdentifier;
    }

    public Event(WhenOccurred whenOccurred, UserIdentifier userIdentifier) {
        this.whenOccurred = whenOccurred;
        this.userIdentifier = userIdentifier;
    }

    public WhenOccurred whenOccurred() {
        return whenOccurred;
    }

}
