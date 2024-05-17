package com.Phenix13.msaccounts.controller;

import com.Phenix13.msaccounts.model.*;
import com.Phenix13.msaccounts.repository.AccountRepository;
import com.Phenix13.msaccounts.service.client.CardsFeignClient;
import com.Phenix13.msaccounts.service.client.LoansFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    LoansFeignClient loansFeignClient;

    @Autowired
    CardsFeignClient cardsFeignClient;


    @PostMapping("/myAccount")
    public Accounts getAccount(@RequestBody Accounts customer){
        return accountRepository.getAccountByCustomerId(customer.getCustomerId());
    }

    @PostMapping("/myCustomerDetails")
    public CustomerDetails myCustomerDetails(@RequestBody Customer customer){
        Accounts account = accountRepository.findByCustomerId(customer.getCustomerId());
        List<Loans> loans = loansFeignClient.getLoansDetails(customer);
        List<Cards> cards = cardsFeignClient.getCardsDetails(customer);

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setAccounts(account);
        customerDetails.setLoans(loans);
        customerDetails.setCards(cards);

        return customerDetails;

    }
}
