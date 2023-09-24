package com.vti.demospring.service.impl;

import com.vti.demospring.modal.entity.Department;
import com.vti.demospring.repository.DepartmentRepositoty;
import com.vti.demospring.service.IDepartmentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Tạo một kiểu dữ liệu là Department vào tring spring Ioc
public class DepartmentSerivce implements IDepartmentSerivce {

    private  final DepartmentRepositoty departmentRepositoty;
    @Autowired
    public DepartmentSerivce(DepartmentRepositoty departmentRepositoty){
    this.departmentRepositoty = departmentRepositoty;
    }

    @Override
    public List<Department> getAll() {
        return departmentRepositoty.findAll();
    }

    @Override
    public Department getById(int id) {
        return departmentRepositoty.findById(id).get();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepositoty.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepositoty.save(department);
    }

    @Override
    public void deleteById(int id) {
    departmentRepositoty.deleteById(id);
    }
}
