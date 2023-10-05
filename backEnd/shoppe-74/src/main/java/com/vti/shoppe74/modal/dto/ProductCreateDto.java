package com.vti.shoppe74.modal.dto;

import com.vti.shoppe74.modal.entity.ProductStatus;
import com.vti.shoppe74.modal.entity.ProductType;
import com.vti.shoppe74.modal.entity.ShippingUnit;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ProductCreateDto {
    @NotBlank(message = "Ảnh sản phẩm không được để trống !")
    private String image;

    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String productName;
    private long price;
    private ProductStatus productStatus;
    private ProductType productType;
    private ShippingUnit shippingUnit;

}
