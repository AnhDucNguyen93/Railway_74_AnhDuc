package com.vti.demospring.controller;

import com.vti.demospring.modal.dto.AccountCreateDto;
import com.vti.demospring.modal.entity.Account;
import com.vti.demospring.service.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@CrossOrigin("*")
//@CrossOrigin("http://127.0.0.1:5500/")
@RestController
@RequestMapping("/api/v1/account")// Khai bao duong dan chung
public class AccountController {
    private final AccountService accountService;
@Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //@RequestMapping(method = RequestMethod.GET) //localhost:{port dang su dung}//api/v1/account
    @GetMapping ("/get-all")//localhost:{port dang su dung}//api/v1/account    "/get-all"
    public List<Account> getAll(){
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public  Account findById(@PathVariable long id){
        return accountService.findById(id);
    }

    @PostMapping()
    public Account create(@RequestBody AccountCreateDto accountDto){
        return accountService.create(accountDto);
    }

    @PutMapping()
    public Account update(@RequestBody Account account){
        return accountService.update(account);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
         accountService.delete(id);
    }
}
