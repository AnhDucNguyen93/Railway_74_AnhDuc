package com.vti.demospring.service;

import com.vti.demospring.modal.dto.AccountCreateDto;
import com.vti.demospring.modal.entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getAll();

    Account findById(long id);

    Account create(AccountCreateDto accountDto);


    Account update(Account account);

    void delete(long id);
}
