package com.example.paymentsystem.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthorizationController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('user')")
    public String getUser() {
        return "Hello, user!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin')")
    public String getAdmin() {
        return "Hello, admin!";
    }
}
