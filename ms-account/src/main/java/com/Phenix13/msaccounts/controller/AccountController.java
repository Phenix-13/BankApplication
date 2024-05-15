package com.Phenix13.msaccounts.controller;

import com.Phenix13.msaccounts.model.Accounts;
import com.Phenix13.msaccounts.repository.AccountRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @PostMapping("/myAccount")
    public Accounts getAccount(@RequestBody Accounts customer){
        return accountRepository.getAccountByCustomerId(customer.getCustomerId());
    }
}
