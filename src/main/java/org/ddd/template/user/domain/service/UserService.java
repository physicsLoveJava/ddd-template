package org.ddd.template.user.domain.service;

import org.ddd.template.user.domain.event.UserRegisteredEvent;
import org.ddd.template.user.domain.model.User;
import org.ddd.template.user.domain.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username, String password) {
        // check if the username is available
        if (userRepository.findByUsername(username) != null) {
            throw new RuntimeException("Username already exists");
        }

        // create the user and save it
        final User newUser = new User(username, password);
        userRepository.save(newUser);

        final UserRegisteredEvent userRegisteredEvent = new UserRegisteredEvent(newUser);
        // publish the event
        // eventPublisher.publish(new UserRegisteredEvent(username));
    }

}
