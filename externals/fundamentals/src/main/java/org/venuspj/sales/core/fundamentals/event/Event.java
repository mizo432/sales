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

    /**
     * イベントが発生した日時を取得します。
     *
     * @return イベントが発生した日時
     */
    public WhenOccurred getWhenOccurred() {
        return whenOccurred;
    }

    /**
     * イベントを発生させたユーザーを取得します。
     *
     * @return イベントを発生させたユーザー
     */
    public UserIdentifier getUserIdentifier() {
        return userIdentifier;

    }

    Event(WhenOccurred whenOccurred, UserIdentifier userIdentifier) {
        this.whenOccurred = whenOccurred;
        this.userIdentifier = userIdentifier;
    }

    public static Event of(WhenOccurred whenOccurred, UserIdentifier userIdentifier) {
        return new Event(whenOccurred, userIdentifier);

    }

}
