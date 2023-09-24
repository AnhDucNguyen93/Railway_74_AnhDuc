package com.vti.demospring.service.impl;

import com.vti.demospring.modal.dto.AccountCreateDto;
import com.vti.demospring.modal.entity.Account;
import com.vti.demospring.modal.entity.Department;
import com.vti.demospring.repository.DepartmentRepositoty;
import com.vti.demospring.repository.IAccountRepository;
import com.vti.demospring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {
    //Gan gia tri vao thuoc tinh nayf
    private final IAccountRepository accountRepository;
    @Autowired
    public AccountService(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Autowired
    private DepartmentRepositoty departmentRepositoty;
    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(long id) {
        //check ton tai cua ID
        return accountRepository.findById(id).get();
    }

    @Override
    public Account create(AccountCreateDto accountDto) {
        // Lấy được đối tượng Department từ AcconutCreateDto departmentId
        Department department = departmentRepositoty.findById(accountDto.getDepartmentId()).get();
        // Tạo ra đôi tượng Account Entity (các giá trị được lấy từ DTO để lưu về)
        Account account = new Account();
        account.setAddress(accountDto.getAddress());
        account.setAvatar(accountDto.getAvatar());
        account.setUserName(accountDto.getUserName());
        account.setDepartment(department);
        return accountRepository.save(account);
    }

    @Override
    public Account update(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(long id) {
        accountRepository.deleteById(id);
    }
}
