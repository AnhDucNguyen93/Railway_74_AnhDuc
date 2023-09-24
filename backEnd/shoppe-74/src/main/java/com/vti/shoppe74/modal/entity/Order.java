package com.vti.shoppe74.modal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "`Order`")
@Getter //Sinh ra cac method getter
@Setter //Sinh ra cac method setter
@NoArgsConstructor //Sinh ra khoi tao khong tham so
@AllArgsConstructor //Sinh ra ham khoi tao co tat ca cac tham so
public class Order extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "ORDER_STATUS")
    @Enumerated(EnumType.STRING)
    private OderStatus oderStatus;

    @Column(name = "QUANTITY")
    private  int quantity;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "`PRODUCT_ID`")
    private Product product;
}
