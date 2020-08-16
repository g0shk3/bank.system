package com.bank.bank.system.service;


import com.bank.bank.system.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {
    void createUpdateUser(User user);

    void createUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    void deleteUserById(Long id);
}
