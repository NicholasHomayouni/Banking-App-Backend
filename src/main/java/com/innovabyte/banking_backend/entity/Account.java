package com.innovabyte.banking_backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "account")
public class Account {
    @Id // @id annotation inherently manages constraints for unique = true and nullable = false
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment primary key
    private Integer id;

    @Column(name = "account_number", unique = true, nullable = false)
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

    public Account(Integer id, String accountNumber, String name, String accountType, Double balance, String status) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.creationDate = new Date();
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
