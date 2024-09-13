package com.innovabyte.banking_backend.controller;

import com.innovabyte.banking_backend.entity.Account;
import com.innovabyte.banking_backend.repository.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost/3000")
@RequestMapping("/api/accounts")
public class AccountController {
    AccountRepository accountRepo;

    public AccountController(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountRepo.findAll();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
}
