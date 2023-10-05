package com.vti.shoppe74.controller;

import com.vti.shoppe74.config.exception.CustomException;
import com.vti.shoppe74.config.exception.ErrorResponseEnum;
import com.vti.shoppe74.modal.dto.AccountCreateDto;
import com.vti.shoppe74.modal.dto.AccountLoginResponse;
import com.vti.shoppe74.modal.entity.Account;
import com.vti.shoppe74.repository.AccountRepository;
import com.vti.shoppe74.utils.JWTTokenUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin("*")

public class AuthController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private JWTTokenUtils jwtTokenUtils;

    @GetMapping("/register")
    public Account register(AccountCreateDto createDto){


        Account account = new Account();
        BeanUtils.copyProperties(createDto, account);
        
        return null;
    }

    @PostMapping("/login-v2")  // sau khi qua bước authen và author mới vào đây
    public AccountLoginResponse loginV2(@RequestParam String username,@RequestParam String password) {
        Optional<Account> accountOptional = accountRepository.findByUsername(username);
        if (accountOptional.isEmpty()) {
            throw new CustomException(ErrorResponseEnum.LOGIN_USERNAME_NOT_EXISTED);
        }
        Account account = accountOptional.get();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        boolean checkPassword = passwordEncoder.matches(password, account.getPassword());
        if (!checkPassword) {
            throw new CustomException(ErrorResponseEnum.LOGIN_PASSWORD_FALSE);
        }
        AccountLoginResponse response = new AccountLoginResponse();
        BeanUtils.copyProperties(account, response);
        return response;
    }
@PostMapping("/login-jwt")  // sau khi qua bước authen và author mới vào đây
    public AccountLoginResponse loginJWT(@RequestParam String username, @RequestParam String password){
            // Bước 1: Kiển tra username
        Optional<Account> accountOptional = accountRepository.findByUsername(username);
        if (accountOptional.isEmpty()) {
            throw new CustomException(ErrorResponseEnum.LOGIN_USERNAME_NOT_EXISTED);
        }
        Account account = accountOptional.get();

        // Bước 2: kiểm tra password
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean checkPassword = passwordEncoder.matches(password, account.getPassword());
        if (!checkPassword) {
            throw new CustomException(ErrorResponseEnum.LOGIN_PASSWORD_FALSE);
        }
        AccountLoginResponse response = new AccountLoginResponse();
        BeanUtils.copyProperties(account, response);

        // Bước 3: Tạo ra Token
        String token = jwtTokenUtils.createAccessToken((response));
        // Bước 4: Set token vào AccountLoginResponse -> return
        response.setToken(token);
        return response;
    }
}
