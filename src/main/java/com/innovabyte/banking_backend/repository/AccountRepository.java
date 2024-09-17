package com.innovabyte.banking_backend.repository;

import com.innovabyte.banking_backend.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findAll();

    Optional<Account> findById(Integer id);
}
