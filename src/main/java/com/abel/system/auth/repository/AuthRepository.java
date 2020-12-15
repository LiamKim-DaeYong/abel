package com.abel.system.auth.repository;

import com.abel.system.auth.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
