package com.innovabyte.banking_backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(name = "created_at")
    private Date creationDate;

    @Column(name = "description")
    private String description;

    @Column(name = "debit")
    private double debit;

    @Column(name = "credit")
    private double credit;

    @Column(name = "balance_after")
    private double balanceAfter;

    public transactions() {}

   // public transactions(int id, )
}
