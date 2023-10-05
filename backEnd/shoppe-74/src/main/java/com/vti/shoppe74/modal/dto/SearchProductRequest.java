package com.vti.shoppe74.modal.dto;

import com.vti.shoppe74.modal.entity.ProductStatus;
import com.vti.shoppe74.modal.entity.ProductType;
import com.vti.shoppe74.modal.entity.ShippingUnit;
import lombok.Data;

import java.util.List;

@Data
public class SearchProductRequest {
    private String productName;
    private List<ProductType> productTypes;
    private List<ShippingUnit> shippingUnits;
    private List<ProductStatus> productStatus;
    private long minPrice;
    private long maxPrice;

    // Các thuộc tính để phân trang và sắp xếp
    private int page;
    private int size;
    private String sortBy; // THuộc tính của entity trong java (VD: "price")
    private String sortType; // Có 2 giá trị là: ASC, DESC
}