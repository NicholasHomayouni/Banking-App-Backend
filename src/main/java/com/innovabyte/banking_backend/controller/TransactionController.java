package com.innovabyte.banking_backend.controller;

import com.innovabyte.banking_backend.entity.Transaction;
import com.innovabyte.banking_backend.repository.TransactionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/transactions")
public class TransactionController {
    private final TransactionRepository transactionRepo;

    public TransactionController(TransactionRepository transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<List<Transaction>> getTransactionsByAccountId(@PathVariable Integer accountId) {
        List<Transaction> transactions = transactionRepo.findTransactionsByAccountId(accountId);
        return ResponseEntity.ok(transactions);
    }
}
