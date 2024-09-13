package com.innovabyte.banking_backend.repository;

import com.innovabyte.banking_backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
