package com.vti.shoppe74.service.impl;

import com.vti.shoppe74.modal.dto.AccountCreateDto;
import com.vti.shoppe74.modal.dto.AccountUpdateDto;
import com.vti.shoppe74.modal.entity.Account;
import com.vti.shoppe74.modal.entity.Role;
import com.vti.shoppe74.repository.AccountRepository;
import com.vti.shoppe74.service.IAccountSerivce;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class) //Nếu gặp lỗi sẽ rollback lại các bước trước. mặc định là runtime Exception
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> accountOptional = accountRepository.findByUsername(username);
        if(accountOptional.isEmpty()){ // Nếu username không tồn tại -> bắn ra lỗi
            throw  new UsernameNotFoundException(username);
        }
        Account account = accountOptional.get();
        // Tạo ra đối tượng UserDetails ( Là đối tượng mà hàm  loadUserByUsername muốn trả về) từ Account
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(account.getRole());    //Truyền đồi tượng được cấp quyền vào author
        return new User(account.getUsername(), account.getPassword(), authorities );
    }
}
