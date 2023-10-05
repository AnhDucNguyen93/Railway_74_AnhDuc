package com.vti.shoppe74.modal.dto;

import com.vti.shoppe74.modal.entity.ProductStatus;
import com.vti.shoppe74.modal.entity.ProductType;
import com.vti.shoppe74.modal.entity.ShippingUnit;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
public class ProductUpdateDto {
    @Positive
    private long id;

    @Length(max = 500, message = "Độ dài url ảnh không được quá 500 ký tự")
    private  String image;

    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String productName;

    @Range(min = 1000, max = 100000000, message = "Giá phải nằm trong khoảng 1000-100000000")
    private long price;

    private ProductStatus productStatus;
    private ProductType productType;
    private ShippingUnit shippingUnit;
}
