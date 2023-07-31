package org.ddd.template.user.domain.repository;

import org.ddd.template.user.domain.model.User;

public interface UserRepository {

    void save(User user);

    User findByUsername(String username);

}
