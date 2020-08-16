package com.bank.bank.system.controller;

import com.bank.bank.system.model.User;
import com.bank.bank.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("use")
public class UserController {

   private final UserService userService;

   @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUpdateUser(@RequestBody User user){
        userService.createUpdateUser(user);
    }


}
