package org.ddd.template.user.application.command.handler;

import org.ddd.template.user.application.command.UserRegistrationCommand;
import org.ddd.template.user.domain.service.UserService;

public class UserRegistrationHandler {

    private final UserService userService;

    public UserRegistrationHandler(UserService userService) {
        this.userService = userService;
    }

    public void handle(UserRegistrationCommand command) {
        userService.registerUser(command.getUsername(), command.getPassword());
    }

}
