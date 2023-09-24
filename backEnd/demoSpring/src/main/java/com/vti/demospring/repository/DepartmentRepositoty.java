package com.vti.demospring.repository;

import com.vti.demospring.modal.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //Khong co van hoat dong binh thuong
public interface DepartmentRepositoty extends JpaRepository<Department, Integer> {
}
