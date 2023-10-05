package com.vti.shoppe74.validate.validator;

import com.vti.shoppe74.repository.AccountRepository;
import com.vti.shoppe74.validate.annotation.CheckUserName;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckUsernameValidator implements ConstraintValidator<CheckUserName, String> {
//Khai báo Repository
    @Autowired
    AccountRepository accountRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        // Logic kiểm tra dữ liệu valie có tồn tại hay không?
//        Boolean kq = accountRepository.existsByUserName(username);
        // Nếu usernam có tồn tại -> kq = true  ->  không hợp lệ -> isValed = false
        return !accountRepository.existsByUsername(username);
    }
}
