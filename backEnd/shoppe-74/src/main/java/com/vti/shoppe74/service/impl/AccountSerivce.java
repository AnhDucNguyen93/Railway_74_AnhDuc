package com.vti.shoppe74.service.impl;

import com.vti.shoppe74.modal.dto.AccountCreateDto;
import com.vti.shoppe74.modal.dto.AccountUpdateDto;
import com.vti.shoppe74.modal.entity.Account;
import com.vti.shoppe74.modal.entity.Role;
import com.vti.shoppe74.repository.AccountRepository;
import com.vti.shoppe74.service.IAccountSerivce;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountSerivce implements IAccountSerivce {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public Account create(AccountCreateDto createDto) {
        Account account = new Account();
        BeanUtils.copyProperties(createDto, account);
        account.setRole(Role.USER);
        return accountRepository.save(account);
    }

    @Override
    public Account update(AccountUpdateDto updateDto) {
        Account account = new Account();
        BeanUtils.copyProperties(updateDto, account);
        account.setRole(Role.USER);
        return accountRepository.save(account);
    }

    @Override
    public void delete(long id) {
    accountRepository.deleteById(id);
    }
}
