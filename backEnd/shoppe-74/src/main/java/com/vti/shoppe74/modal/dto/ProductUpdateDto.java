package com.vti.shoppe74.modal.dto;

import com.vti.shoppe74.modal.entity.ProductStatus;
import com.vti.shoppe74.modal.entity.ProductType;
import com.vti.shoppe74.modal.entity.ShippingUnit;
import lombok.Data;

@Data
public class ProductUpdateDto {
    private long id;
    private  String image;
    private String productName;
    private long price;
    private ProductStatus productStatus;
    private ProductType productType;
    private ShippingUnit shippingUnit;
}
