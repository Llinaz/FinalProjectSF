package org.example.finalprojectsf.controller;

import org.example.finalprojectsf.model.Account;
import org.example.finalprojectsf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/{userId}")
    public Optional<Account> getAccount(@PathVariable int userId) {
        return accountService.getAccount(userId);
    }


    @PutMapping("/{userId}/putMoney")
    public Account putMoney(@PathVariable int userId, @RequestParam int amount) {
        return accountService.putMoney(userId, amount);
    }

    @PutMapping("/{userId}/takeMoney")
    public Account takeMoney(@PathVariable int userId, @RequestParam int amount) {
        return accountService.takeMoney(userId, amount);
    }
}
