package com.innovabyte.banking_backend.repository;

import com.innovabyte.banking_backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId")
    List<Transaction> findTransactionsByAccountId(@Param("accountId") Integer accountId);
}
