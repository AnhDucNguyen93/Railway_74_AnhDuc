package com.vti.demospring.modal.entity;

import lombok.Data;

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
        this.createDate = new Date();
        this.createBy = "Mr.Duc";
    }
    @PreUpdate
    public void preUpdate(){
        this.updateDate = new Date();
        this.updateBy = "Mr.Duc";
    }

}
