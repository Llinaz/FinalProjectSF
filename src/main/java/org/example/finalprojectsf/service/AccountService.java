package org.example.finalprojectsf.service;


import org.example.finalprojectsf.model.Account;
import org.example.finalprojectsf.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> getAccount(int userId) {
        return accountRepository.findById(userId);
    }


    @Transactional
    public Account putMoney(int userId, int amount) {
        Account account = getAccount(userId).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(account.getBalance() + amount);
        return accountRepository.save(account);
    }

    @Transactional
    public Account takeMoney(int userId, int amount) {
        Account account = getAccount(userId).orElseThrow(() -> new RuntimeException("Account not found"));
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - amount);
        return accountRepository.save(account);
    }
}
