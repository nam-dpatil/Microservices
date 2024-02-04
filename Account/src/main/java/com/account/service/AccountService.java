package com.account.service;

import com.account.model.Account;
import com.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {


    Account getAccountById(int id);

    List<Account> getAccountAll();

    Account postAccount(Account account);



}
