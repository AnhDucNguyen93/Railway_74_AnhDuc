package com.vti.shoppe74.repository.specification;

import com.vti.shoppe74.modal.dto.SearchProDuctRequest;
import com.vti.shoppe74.modal.entity.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {
    public static Specification<Product> buildCondition(SearchProDuctRequest request) {
        return Specification.where(buildConditionName(request))
                .and(buildConditionProductType(request))
                .and(buildConditionShippingUnit(request))
                .and(buildConditionStatus(request))
                .and(buildConditionPrice(request));
    }

    public static Specification<Product> buildConditionName(SearchProDuctRequest request) {
        if (request.getProductName() != null && !"".equals(request.getProductName())) {
            // Tạo điều kiện tìm kiếm với name
            return (root, query, cri) -> {
                // root: Chọn cột, field, để tìm kiếm (giá trị là thuộc tính Product trong java)
                // cri: CriteriaBuilder Khai báo loại so sánh dữ liệu. ( lớn hơn, nhỏ hơn, equal, like,.... )
                return cri.like(root.get("productName"), "%" + request.getProductName() + "%");
            };
        } else {
            return null;
        }
    }

    public static Specification<Product> buildConditionProductType(SearchProDuctRequest request) {
        if (request.getProductTypes() != null && request.getProductTypes().size() > 0) {
            return (root, query, cri) -> {
                // Tạo điều kiện tìm kiếm với productType. Producttype sẽ là 1 trong các giá trị truyền vào
                return root.get("productType").in(request.getProductTypes());
            };
        } else {
            return null;
        }
    }
    public static Specification<Product> buildConditionStatus(SearchProDuctRequest request) {
        if (request.getProductStatus() != null && request.getProductStatus().size() > 0) {
            return (root, query, cri) -> {
                // Tạo điều kiện tìm kiếm với productType. Producttype sẽ là 1 trong các giá trị truyền vào
                return root.get("productStatus").in(request.getProductStatus());
            };
        } else {
            return null;
        }
    }
    public static Specification<Product> buildConditionShippingUnit(SearchProDuctRequest request) {
        if (request.getShippingUnits() != null && request.getShippingUnits().size() > 0) {
            return (root, query, cri) -> {
                // Tạo điều kiện tìm kiếm với productType. Producttype sẽ là 1 trong các giá trị truyền vào
                return root.get("shippingUnit").in(request.getShippingUnits());
            };
        } else {
            return null;
        }
    }
    public static Specification<Product> buildConditionPrice(SearchProDuctRequest request){
        // CÓ thể viết logic chặt chẽ hơn
        if (request.getMinPrice() != 0 && request.getMaxPrice() != 0){ // Nếu ko truyền phần tử nào -> lấy tất cả
            return (root, query, cri) -> {
                return cri.between(root.get("price"), request.getMinPrice(), request.getMaxPrice());
            };
        } else {
            return null;
        }
    }

}
