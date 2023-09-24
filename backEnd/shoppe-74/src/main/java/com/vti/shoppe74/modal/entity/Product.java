package com.vti.shoppe74.modal.entity;

import com.vti.shoppe74.modal.dto.ProductCreateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@Getter //Sinh ra cac method getter
@Setter //Sinh ra cac method setter
@NoArgsConstructor //Sinh ra khoi tao khong tham so
@AllArgsConstructor //Sinh ra ham khoi tao co tat ca cac tham so
public class Product extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name= "IMAGE", length = 500)
    private  String image;

    @Column(name= "PRODUCT_NAME", columnDefinition = "nvarchar(100)", nullable = false, unique = true)
    private String productName;

    @Column(name= "PRICE")
    private long price;

    @Column(name= "PRODUCT_TYPE")
    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @Column(name= "SHIPPING_UNIT")
    @Enumerated(EnumType.STRING)
    private ShippingUnit shippingUnit;

    @Column(name= "PRODUCT_STATUS")
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

   // public Product(ProductCreateDto)
}
