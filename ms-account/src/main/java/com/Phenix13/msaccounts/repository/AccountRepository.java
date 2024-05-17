package com.Phenix13.msaccounts.repository;

import com.Phenix13.msaccounts.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    public Accounts getAccountByCustomerId(int customerId);

    public Accounts findByCustomerId(int customerId);
}
