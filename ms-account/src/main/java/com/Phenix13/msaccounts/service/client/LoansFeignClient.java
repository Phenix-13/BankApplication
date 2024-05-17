package com.Phenix13.msaccounts.service.client;

import com.Phenix13.msaccounts.model.Customer;
import com.Phenix13.msaccounts.model.Loans;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("ms-loans")
public interface LoansFeignClient {

    @RequestMapping(method = RequestMethod.POST,value = "myLoans",consumes = "application/json")
    List<Loans> getLoansDetails(@RequestBody Customer customer);
}
