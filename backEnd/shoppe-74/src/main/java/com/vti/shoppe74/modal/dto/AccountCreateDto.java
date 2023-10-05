package com.vti.shoppe74.modal.dto;

import com.vti.shoppe74.validate.annotation.CheckUserName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
public class AccountCreateDto {
    @NotBlank(message = "Tên người dùng không được để trống")
    @CheckUserName(message = "NGười dùng đã tồn tại") //Check UserName có tồn tại trong DB chưa, nếu rồi ->lỗi
    private  String userName;
    private String fullName;
    private  String avatar;
    private  String address;
    private LocalDate dateBirth;
    private String infomation;
    private String password;
    private String phonenumber;

}
