package com.innovabyte.banking_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "account")
public class accounts {
    @id
    private int id;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "created_at")
    private Date creationDate;

    @Column(name = "status")
    private String status;

    public accounts(int id, String accountNumber, String name, String accountType, Double balance, String status) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.creationDate = new Date();
        this.status = status;
    }


}
