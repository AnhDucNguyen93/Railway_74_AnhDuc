package com.vti.demospring.controller;

import com.vti.demospring.modal.entity.Department;
import com.vti.demospring.service.impl.DepartmentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
//    @RequestMapping("/home")
//public String homePage(){
//        return "index";
//    }
    @Autowired
    private DepartmentSerivce departmentSerivce;
    // Kieu du lieu tra ve cua chuc nang do la gi?
    // Ten method
    // Co cac bien truyen vao nao de thuc hien chuc nang do?

    //THực hiện thao tác tới chức năng tương ứng bên Service
    // Cac bien do duoc truyen theo cach nao? Truyen vao trong body( Neu API có phuong thức là get thì không dùng body)
    // Truyền biến ngay trên URL: PathVariable. RequestParams
    //Phương thức của API là gì?
    // ĐƯỜng dẫn để gọi tới chức năng này như nào?
    @GetMapping("/get-all")  //http://localhost:8080/api/vi/department/get-all
    public List<Department> getAll(){
       return departmentSerivce.getAll();
    }
    @GetMapping("/{id}")
    public Department getById(@PathVariable int id){
        return departmentSerivce.getById(id);
    }
    @PostMapping("/create")
    public Department create(@RequestBody Department department){
        return departmentSerivce.createDepartment(department);
    }
    @PutMapping()
    public Department update(@RequestBody Department department){
        return  departmentSerivce.updateDepartment(department);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        departmentSerivce.deleteById(id);
    }
}
