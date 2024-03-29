package com.vti.shoppe74.controller;

import com.vti.shoppe74.modal.dto.AccountCreateDto;
import com.vti.shoppe74.modal.dto.AccountUpdateDto;
import com.vti.shoppe74.modal.entity.Account;
import com.vti.shoppe74.service.IAccountSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
@CrossOrigin("*")
@Validated
public class AccountController {
    @Autowired
    private IAccountSerivce accountSerivce;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/get-all")
    public List<Account> getAll() {
        return accountSerivce.getAll();
    }

    @GetMapping("/{id}")
    public Account getById(@PathVariable long id) {
        return accountSerivce.getById(id);
    }

    @PostMapping("/create")
    public Account create(@RequestBody @Valid AccountCreateDto createDto) {
        return accountSerivce.create(createDto);
    }

    @PutMapping("/update")
    public Account update(@RequestBody AccountUpdateDto updateDto) {
        return accountSerivce.update(updateDto);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        accountSerivce.delete(id);
    }

}
