package com.account.controller;

import com.account.model.Account;
import com.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id)
    {
        return accountService.getAccountById(id);
    }

    @GetMapping("/")
    public List<Account> getAccountAll()
    {
        return accountService.getAccountAll();
    }

    @PostMapping("/")
    public Account PostAccountAll(@RequestBody Account account)
    {
        return accountService.postAccount(account);
    }
}
