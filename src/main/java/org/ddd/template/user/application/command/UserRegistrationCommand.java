package org.ddd.template.user.application.command;

public class UserRegistrationCommand {

    private final String username;
    private final String password;

    public UserRegistrationCommand(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
