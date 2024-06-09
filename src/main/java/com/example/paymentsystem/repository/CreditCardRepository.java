package com.example.paymentsystem.repository;

import com.example.paymentsystem.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
    List<CreditCard> findByClientId(Long clientId);
}
