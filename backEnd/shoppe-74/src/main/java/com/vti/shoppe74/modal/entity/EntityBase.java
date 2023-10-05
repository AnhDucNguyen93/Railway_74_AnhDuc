package com.vti.shoppe74.modal.entity;

import lombok.Data;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@Data // CÓ getter, setter, toString
@MappedSuperclass //day la đánh dấu class này cũng là một phần của entity kế thừa tới nó
public class EntityBase {
    @Column(name = "CREATEBY")
    protected String createBy;

    @Column(name = "CREATEDATE")
    protected Date createDate;

    @Column(name = "UPDATEBY")
    protected String updateBy;

    @Column(name = "UPDATEDATE")
    protected Date updateDate;

    @PrePersist
    public void prePersist(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication(); //Khởi tạo hàm để hiển thị userName đã thực thi
        String username = auth.getName();
        this.createDate = new Date();
        this.createBy = username;
    }
    @PreUpdate
    public void preUpdate(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication(); //Khởi tạo hàm để hiển thị userName đã update
        String username = auth.getName();
        this.updateDate = new Date();
        this.updateBy = username;
    }

}
