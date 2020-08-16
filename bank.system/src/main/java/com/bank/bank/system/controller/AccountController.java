package com.bank.bank.system.controller;

import com.bank.bank.system.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @PostMapping
    public void createAccount(@RequestBody Account account){

    }

    @PutMapping
    public void updateAccount(@RequestBody Account account){

    }

}
