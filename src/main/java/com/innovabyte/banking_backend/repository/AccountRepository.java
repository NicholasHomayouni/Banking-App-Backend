package com.innovabyte.banking_backend.repository;

import com.innovabyte.banking_backend.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
