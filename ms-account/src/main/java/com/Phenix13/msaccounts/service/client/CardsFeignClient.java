package com.Phenix13.msaccounts.service.client;

import com.Phenix13.msaccounts.model.Cards;
import com.Phenix13.msaccounts.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("ms-cards")
public interface CardsFeignClient {
    @RequestMapping(method = RequestMethod.POST,value = "myCards",consumes = "application/json")
    List<Cards> getCardsDetails(@RequestBody Customer customer);
}
