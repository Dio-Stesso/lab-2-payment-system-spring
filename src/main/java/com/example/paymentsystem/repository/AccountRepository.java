package com.example.paymentsystem.repository;

import com.example.paymentsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByCreditCardId(Long creditCardId);
}
