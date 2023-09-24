package com.vti.demospring.service;


import com.vti.demospring.modal.entity.Department;

import java.util.List;

public interface IDepartmentSerivce {
    // Kieu du lieu tra ve cua chuc nang do la gi?
    // Ten method
    // Co cac bien truyen vao nao de thuc hien chuc nang do?
    List<Department> getAll();

    Department getById(int id);

    Department createDepartment(Department department);

    Department updateDepartment(Department department);

    void deleteById(int id);
}
