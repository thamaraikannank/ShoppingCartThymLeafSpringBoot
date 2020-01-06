package com.shopping.service;

import java.util.Optional;

import com.shopping.model.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}
