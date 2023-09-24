package com.vti.shoppe74.service;

import com.vti.shoppe74.modal.dto.AccountCreateDto;
import com.vti.shoppe74.modal.dto.AccountUpdateDto;
import com.vti.shoppe74.modal.entity.Account;

import java.util.List;

public interface IAccountSerivce {
    List<Account> getAll();

    Account getById(long id);

    Account create(AccountCreateDto createDto);

    Account update(AccountUpdateDto updateDto);

    void delete(long id);
}
