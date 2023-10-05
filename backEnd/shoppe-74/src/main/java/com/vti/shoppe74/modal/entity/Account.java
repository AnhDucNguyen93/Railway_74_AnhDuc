package com.vti.shoppe74.modal.entity;

import com.vti.shoppe74.modal.dto.AccountCreateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

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
    private  String username;

    @Column(name= "FULL_NAME", columnDefinition = "nvarchar(100)")
    private String fullName;

    @Column(name= "AVATAR", length = 500)
    private  String avatar;

    @Column(name= "ADDRESS", columnDefinition = "nvarchar(100)")
    private  String address;

    @Column(name= "DATE_OF_RTH")
    private LocalDate dateBirth;

    @Column(name= "INFOMATION", columnDefinition = "nvarchar(100)")
    private String infomation;

    @Column(name= "PASSWORD", length = 100)
    private String password;

    @Column(name= "PHONE_NUMBER", length = 15)
    private String phonenumber;

    @Column(name= "ROLE")
    @Enumerated(EnumType.STRING)
    private  Role role;

    public Account(AccountCreateDto createDto){
        this.username = createDto.getUserName();
    }
}
