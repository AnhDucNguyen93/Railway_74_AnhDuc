package com.vti.demospring.repository;

import com.vti.demospring.modal.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Long> {
}
