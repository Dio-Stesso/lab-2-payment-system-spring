package com.example.paymentsystem.service;

import com.example.paymentsystem.model.CreditCard;
import com.example.paymentsystem.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardService {
    @Autowired
    private CreditCardRepository creditCardRepository;

    public List<CreditCard> findAll() {
        return creditCardRepository.findAll();
    }

    public Optional<CreditCard> findById(Long id) {
        return creditCardRepository.findById(id);
    }

    public List<CreditCard> findByClientId(Long clientId) {
        return creditCardRepository.findByClientId(clientId);
    }

    public CreditCard save(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    public void deleteById(Long id) {
        creditCardRepository.deleteById(id);
    }
}
