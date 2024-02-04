package com.account.serviceimpl;

import com.account.model.Account;
import com.account.repository.AccountRepository;
import com.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Account getAccountById(int id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public List<Account> getAccountAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account postAccount(Account account) {
        return accountRepository.save(account);
    }
}
