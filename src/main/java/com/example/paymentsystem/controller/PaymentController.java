package com.example.paymentsystem.controller;

import com.example.paymentsystem.model.Payment;
import com.example.paymentsystem.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.findAll();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid payment ID"));
    }

    @GetMapping("/account/{accountId}")
    public List<Payment> getPaymentsByAccountId(@PathVariable Long accountId) {
        return paymentService.findByAccountId(accountId);
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        payment.setId(id);
        return paymentService.save(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deleteById(id);
    }
}
