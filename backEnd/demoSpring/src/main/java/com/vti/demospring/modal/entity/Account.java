package com.vti.demospring.modal.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Account")
@Getter //Sinh ra cac method getter
@Setter //Sinh ra cac method setter
@NoArgsConstructor //Sinh ra khoi tao khong tham so
@AllArgsConstructor //Sinh ra ham khoi tao co tat ca cac tham so
public class Account extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name= "USERNAME", columnDefinition = "nvarchar(100)", nullable = false, unique = true)
    private  String userName;

    @Column(name= "AVATAR", length = 500)
    private  String avatar;

    @Column(name= "ADDRESS", columnDefinition = "nvarchar(100)")
    private  String address;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
