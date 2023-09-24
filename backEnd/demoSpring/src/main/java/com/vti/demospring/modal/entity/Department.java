package com.vti.demospring.modal.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Department extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "ID")
    private  int id;

    @Column(name = "DEPARTMENT_NAME", columnDefinition = "nvarchar(100)", nullable = false, unique = true)
    private String departmentName;
}
