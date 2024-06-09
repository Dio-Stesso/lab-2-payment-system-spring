package com.example.paymentsystem.controller;

import com.example.paymentsystem.model.CreditCard;
import com.example.paymentsystem.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/creditcards")
public class CreditCardController {
    @Autowired
    private CreditCardService creditCardService;

    @GetMapping
    public List<CreditCard> getAllCreditCards() {
        return creditCardService.findAll();
    }

    @GetMapping("/{id}")
    public CreditCard getCreditCardById(@PathVariable Long id) {
        return creditCardService.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid credit card ID"));
    }

    @GetMapping("/client/{clientId}")
    public List<CreditCard> getCreditCardsByClientId(@PathVariable Long clientId) {
        return creditCardService.findByClientId(clientId);
    }

    @PostMapping
    public CreditCard createCreditCard(@RequestBody CreditCard creditCard) {
        return creditCardService.save(creditCard);
    }

    @PutMapping("/{id}")
    public CreditCard updateCreditCard(@PathVariable Long id, @RequestBody CreditCard creditCard) {
        creditCard.setId(id);
        return creditCardService.save(creditCard);
    }

    @DeleteMapping("/{id}")
    public void deleteCreditCard(@PathVariable Long id) {
        creditCardService.deleteById(id);
    }
}
