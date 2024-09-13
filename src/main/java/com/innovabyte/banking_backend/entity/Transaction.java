package com.innovabyte.banking_backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    public Transaction() {}

    public Transaction(Integer id, String description, double debit, double credit, double balanceAfter, Account account) {
        this.id = id;
        this.description = description;
        this.debit = debit;
        this.credit = credit;
        this.balanceAfter = balanceAfter;
        this.creationDate = new Date();
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }
}
