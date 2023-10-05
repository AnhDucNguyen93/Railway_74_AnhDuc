package com.vti.shoppe74.service;

import com.vti.shoppe74.modal.dto.AccountCreateDto;
import com.vti.shoppe74.modal.dto.AccountUpdateDto;
import com.vti.shoppe74.modal.entity.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IAccountSerivce extends UserDetailsService {
    List<Account> getAll();

    Account getById(long id);

    Account create(AccountCreateDto createDto);

    Account update(AccountUpdateDto updateDto);

    void delete(long id);
}
