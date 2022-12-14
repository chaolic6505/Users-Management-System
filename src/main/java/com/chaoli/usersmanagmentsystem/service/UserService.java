package com.chaoli.usersmanagmentsystem.service;

import com.chaoli.usersmanagmentsystem.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    boolean deleteUser(Long id);

    User updateUser(Long id, User user);

    User getUserById(Long id);
}
