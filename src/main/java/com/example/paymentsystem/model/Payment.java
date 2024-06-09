package com.example.paymentsystem.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private LocalDateTime date;

    private String recipient;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;
}
