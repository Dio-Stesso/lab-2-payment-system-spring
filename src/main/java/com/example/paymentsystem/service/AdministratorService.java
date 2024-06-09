package com.example.paymentsystem.service;

import com.example.paymentsystem.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    public void unblockAccount(Long accountId) {
        administratorRepository.unblockAccount(accountId);
    }
}
