package org.ddd.template.user.application.query.handler;

import org.ddd.template.user.application.query.GetUserByNameQuery;
import org.ddd.template.user.domain.model.User;
import org.ddd.template.user.domain.repository.UserRepository;

public class GetUserByNameQueryHandler {

    private final UserRepository userRepository;

    public GetUserByNameQueryHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handle(GetUserByNameQuery query) {
        return userRepository.findByUsername(query.getUsername());
    }

}
