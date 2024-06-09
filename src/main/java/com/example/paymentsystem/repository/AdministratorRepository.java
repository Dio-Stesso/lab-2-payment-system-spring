package com.example.paymentsystem.repository;

import com.example.paymentsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AdministratorRepository extends JpaRepository<Account, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE Account a SET a.status = 'active' WHERE a.id = :accountId")
    void unblockAccount(Long accountId);
}
