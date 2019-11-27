package com.stylefeng.guns.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "account")
public class AccountController {
    @RequestMapping("login")
    public Account login(String username,String password){
        System.out.println(username);
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        return account;
    }
}
