package com.vti.demospring.modal.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AccountCreateDto {
    private  String userName;
    private  String avatar;
    private  String address;
    private int departmentId;
}
