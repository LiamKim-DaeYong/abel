package com.abel.system.auth.service;

import com.abel.system.auth.domain.Account;
import com.abel.system.auth.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AuthService{

    private final AuthRepository userRepository;

    @Transactional
    public Account createUser(Account account) {
        return userRepository.save(account);
    }
}
