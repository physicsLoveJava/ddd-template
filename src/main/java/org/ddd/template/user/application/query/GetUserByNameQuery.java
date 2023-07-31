package org.ddd.template.user.application.query;

public class GetUserByNameQuery {

    private final String username;

    public GetUserByNameQuery(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

}
