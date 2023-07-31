package org.ddd.template.user.domain.event;

import org.ddd.template.user.domain.model.User;

public class UserRegisteredEvent {

    private final User user;

    public UserRegisteredEvent(User user) {
        this.user = user;
    }

}
