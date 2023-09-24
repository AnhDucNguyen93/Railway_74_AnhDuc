package com.vti.shoppe74.modal.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AccountCreateDto {
    private  String userName;
    private String fullName;
    private  String avatar;
    private  String address;
    private LocalDate dateBirth;
    private String infomation;
    private String password;
    private String phonenumber;

}
