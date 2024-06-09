package com.example.paymentsystem.controller;

import com.example.paymentsystem.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @PutMapping("/unblock/{accountId}")
    public void unblockAccount(@PathVariable Long accountId) {
        administratorService.unblockAccount(accountId);
    }
}
